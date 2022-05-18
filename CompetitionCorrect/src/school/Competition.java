package school;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.Collator;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Competition {

    private ArrayList<Runner> runners;
    private String name;

    public void loadStart(File startFile) throws FileNotFoundException, IOException {
        ArrayList<Integer> errorLines = new ArrayList<>();
        try ( BufferedReader br = new BufferedReader(new FileReader(startFile))) {
            int lineNumber = 1;
            String line, firstName, lastName;
            String dob;
            char gender;
            String[] parts;
            Runner r;
            br.readLine(); //preskocim hlavicku
            while ((line = br.readLine()) != null) {
                lineNumber ++;
                parts = line.split("[ ]+");
                firstName = parts[0];
                lastName = parts[1];
                //dob = Integer.parseInt(parts[2]); 
                dob = parts[2];
                gender = parts[3].charAt(0);
                r = new Runner(firstName, lastName);
                try{
                    r.setDob(dob);
                }catch(DateTimeParseException e){
                    r.setDob("2011-02-03");
                    errorLines.add(lineNumber);
                }
                r.setGender(gender);
                runners.add(r);
            }
        }
        if(!errorLines.isEmpty()){
            throw new RuntimeException("chyba na radcich " + errorLines.toString());
        }
        
    }
    
    public void loadFinish(File finishFile) throws FileNotFoundException{
        try(Scanner in = new Scanner(finishFile)){
            //in.useDelimiter(",");
            int number;
            String finishTime;
            in.nextLine();
            while(in.hasNext()){
               number = in.nextInt();
               finishTime = in.next();
               findRunner(number).setEndTime(finishTime);   
           } 
        }
    }
    
    public void saveToFile(File results) throws IOException{
        try(PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(results)))){
            //new PrintWriter(new OutputStreamWriter () pouzit, kdyz chci kodovani
            sortByRunTime();
            int n = 1;
            for (Runner runner : runners) {
               pw.print(n + ". ");
               pw.println(runner.toString());
               n++;
            }
        }
    }
    
    public void saveToBinary(File results) throws FileNotFoundException, IOException{
        try(DataOutputStream out = new DataOutputStream(new FileOutputStream(results,true))){
            sortByRunTime();
            out.writeInt(runners.size());
            for (Runner runner : runners) {
                   out.writeUTF(runner.getName());
                   out.writeInt(runner.getSurName().length());
                   for (int i = 0; i < runner.getSurName().length(); i++) {
                       out.writeChar(runner.getSurName().charAt(i));
                   }
                   out.writeInt(runner.getRunTime());
            }
        }
    }
    
    public String readBinaryResults(File results) throws FileNotFoundException, IOException{
        StringBuilder sb = new StringBuilder(); 
        try(DataInputStream in = new DataInputStream(new FileInputStream(results))){
           boolean end = false;
           int nRunners, nLetters, time = 0;
           int rank = 1;
           String name = "", surname = "";
            while(!end) {
                try{
                   nRunners = in.readInt();
                    for (int i = 0; i < nRunners; i++) {
                        name = in.readUTF();
                        nLetters = in.readInt();
                        surname = "";
                        for (int j = 0; j < nLetters; j++) {
                            surname += in.readChar();
                        }
                        time = in.readInt();
                        sb.append(String.format("%2d. %10s%10s%10s%n", rank, name, surname, TimeTools.secondsToStringTime(time)));
                        rank++;
                    }
                    rank = 1;
                    sb.append("\n");
                    }catch(EOFException e){
                    end = true;
                }
            }
        }
        return sb.toString();
    }

    public static final Collator col = Collator.getInstance(new Locale("cs", "CZ"));
    //public static final Comparator<Runner> COMP_BY_NAME = (Runner r1, Runner r2) -> r1.getSurName().compareTo(r2.getSurName());
    public static final Comparator<Runner> COMP_BY_NAME = (Runner r1, Runner r2) -> {
        int value = col.compare(r1.getSurName(), r2.getSurName());
        if (value == 0) {
            value = col.compare(r1.getName(), r2.getName());
        }
        return value;
    };

    public Competition(String name) {
        this.name = name;
        runners = new ArrayList<>();
    }

    public void registerRunner(String name, String surname) {
        Runner newRunner = new Runner(name, surname);
        this.runners.add(newRunner);
    }

    public void removeRunner(int runnerNumber) {
        Runner runner = findRunner(runnerNumber);
        boolean runnerRemoved = runners.remove(runner);

        if (!runnerRemoved) {
            throw new NoSuchElementException("Runner not found.");
        }
    }

    public void setStartTimeAll(int hours, int minutes, int seconds) {
        for (Runner runner : runners) {
            runner.setStartTime(hours, minutes, seconds);
        }
    }

    public void setStartTimeAll(int startTime) {
        for (Runner runner : runners) {
            runner.setStartTime(startTime);
        }
    }

    //The start time is calculated based on the registration number 
    public void setStartTimeAll(int offsetInMinutes, int startTime) {
        for (Runner runner : runners) {
            int mult = runner.getRegistrationNumber();
            runner.setStartTime(startTime + mult * (offsetInMinutes * 60));
        }
    }

    public void setStartTimeAll(int offsetInMinutes, int hours, int minutes, int seconds) {
        for (Runner runner : runners) {
            int mult = runner.getRegistrationNumber();
            runner.setStartTime(hours, minutes + (offsetInMinutes * mult), seconds);
        }
    }

    public void setStartTimeOf(int runnerNumber, int hours, int minutes, int seconds) {
        findRunner(runnerNumber).setStartTime(hours, minutes, seconds);
    }

    public void setEndTimeOf(int runnerNumber, int hours, int minutes, int seconds) {
        findRunner(runnerNumber).setEndTime(hours, minutes, seconds);
    }

    public Runner findRunner(int runnerNumber) {
        for (Runner runner : runners) {
            if (runner.getRegistrationNumber() == runnerNumber) {
                return runner;
            }
        }

        throw new NoSuchElementException("Runner not found.");
    }

    //deep copy
    public ArrayList<Runner> getRunners() {
        ArrayList<Runner> copy = new ArrayList<>();
        for (Runner runner : runners) {
            copy.add(new Runner(runner));
        }
        return copy;
    }

    private void sortBySurName() {
        Collections.sort(runners);
    }

    private void sortByRunTime() {
        Comparator cbrt = new ComparatorRunnerByRunTime();
        Collections.sort(runners, cbrt);
    }

    private void sortByNumberold() {
        Collections.sort(runners, new Comparator<Runner>() {
            @Override
            public int compare(Runner o1, Runner o2) {
                //return o1.getRunTime() - ((Runner)o2).getRunTime();
                return o1.getRunTime() - o2.getRunTime();
            }

        });
    }

    private void sortByNumber() {
        Collections.sort(runners, (Runner o1, Runner o2) -> o1.getRunTime() - o2.getRunTime());
    }

    private void sortBySurname() {
        Collections.sort(runners, COMP_BY_NAME);
    }

    public ArrayList<Runner> getRunnersSortedbySurName() {
        sortBySurName();
        return getRunners();
    }

    public ArrayList<Runner> sortByTime() {
        //TODO
        return null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Runner runner : runners) {
            builder.append(runner.toString()).append("\n");
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Competition competition = new Competition("Run Czech");
        try{
            try{
                competition.loadStart(new File("start.txt"));
            }catch(RuntimeException e){
                System.out.println(e.getMessage());
            }
        //competition.registerRunner("Cyril", "Black");
        //competition.registerRunner("Bob", "Green");
        //competition.registerRunner("Alice", "Blue");
        //}catch(FileNotFoundException e){
        //    System.out.println("Zadej znovu"); //mohla cyklit
        //}
        System.out.println(competition);

        competition.setStartTimeAll(2, 12, 0, 0);
        System.out.println(competition);
        competition.loadFinish(new File("finish.txt"));
        //competition.setEndTimeOf(3, 12, 30, 0);
        System.out.println(competition);

        competition.sortBySurName();
        System.out.println(competition);
        competition.saveToFile(new File("data" + File.separator + "results.txt"));
        competition.saveToBinary(new File("data" + File.separator + "results.dat"));
        System.out.println(competition.readBinaryResults(new File("data" + File.separator + "results.dat")));
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
