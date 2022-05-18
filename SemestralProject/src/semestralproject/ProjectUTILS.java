/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semestralproject; //class

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author norbert.roland.kny
 */
public class ProjectUTILS {
    //LocalDateTime myObj = LocalDateTime.now();
    //System.out.println(myObj);
    public class Pracovnik implements Comparable<Pracovnik>{
    private String name;
    private String surname;
    
//    private int startNumber;
    private int startTime;
    private int finishTime;
    private int finalTime;
    
//    private String currentRace;
//    private int yearOfBirth;
//    private boolean sex;
//    private String club;
//    private int wave;
//    private boolean tax;
//    private int rank;
//    
//    private static int startNumberCount = 1;
    
    
//    public Pracovnik(String name,String surname){
//        this.name = name;
//        this.surname = surname;
////        startNumber = startNumberCount = 1;
////        startNumberCount++;
//    }
    
    private Pracovnik(String name,String surname, int startTime,int finishTime, int finalTime){
        this.name = name;
        this.surname = surname;
        this.startTime= startTime;
        this.finishTime= finishTime;
        this.finalTime= finalTime;

    }
    
    //**************************************************************************
    public String getName(){
        return name;
    }
    
    public String getSurname(){
        return surname;
    }
    
//    public String getCurrentRace(){
//        return currentRace;
//    }
//    
//    public boolean getSex(){
//        return sex;
//        //1 male, 0 female
//    }
//    
//    public String getClub(){
//        return club;
//    }
//    
//    public int getStartNumber(){
//        return startNumber;
//    }
    
    public int getStartTime(){
        return startTime;
    }
    
    public int getFinishTime(){
        return finishTime;
    }
    
    public int getFinalTime(){
        finalTime = finishTime - startTime;
        return finalTime;
    }
    
//    public int getYearOfBirth(){
//        return yearOfBirth;
//    }
//    
//    public int getWave(){
//        return wave;
//    }
//    
//    public int getRank(){
//        return rank;
//    }
//    
//    public boolean getTax(){
//        return tax;
//    }
    //**************************************************************************
//    public void setTax(boolean tax){
//        this.tax = tax;
//    }
//    
//    public void setSex(boolean sex){
//        this.sex = sex;
//        //1 male, 0 female
//    }
    
     public void setName(String name){
        this.name = name;
    }
    
    public void setSurname(String surname){
        this.surname = surname;
    }
    
//    public void setCurrentRace(String currentRace){
//        this.currentRace = currentRace;
//    }
//    
//    public void setClub(String club){
//        this.club = club;
//    }
//    
//    public void setStartNumber(int startNumber){
//        this.startNumber = startNumber;
//    }
    
    public void setStartTime(int startTime){
        this.startTime = startTime;
    }
    
    public void setFinishTime(int finishTime){
        this.finishTime = finishTime;
    }
    
    public void setFinalTime(int finalTime){
        this.finalTime = finalTime;
    }
    
//    public void setYearOfBirth(int yearOfBirth){
//        this.yearOfBirth = yearOfBirth;
//    }
//    
//    public void setWave(int wave){
//        this.wave = wave;
//    }
//    
//    public void setRank(int rank){
//        this.rank = rank;
//    }
    //--------------------------------------------------------------------------
    @Override
    public String toString(){
        //return String.format("%10s %10s %5d, %02d:%02d:%02d", name, surname, startNumber, finalTime);
        return String.format("%10s %10s %5d, %02", name, surname, startTime, finishTime, finalTime);
    }
    
    public String ReadableStartTime(int startTime){
        int hour = startTime/3600;
        int min = (startTime%3600)/60;
        int sec = startTime - (hour*3600)-(min*60);
        return String.format("%d:%d:%d",hour,min,sec);
    }
    
    public String ReadableFinishTime(int finishTime){
        int hour = finishTime/3600;
        int min = (finishTime%3600)/60;
        int sec = finishTime - (hour*3600)-(min*60);
        return String.format("%d:%d:%d",hour,min,sec);
    }
        
    public String ReadableFinalTime(int finalTime){
        int hour = finalTime/3600;
        int min = (finalTime%3600)/60;
        int sec = finalTime - (hour*3600)-(min*60);
        return String.format("%d:%d:%d",hour,min,sec);
    }
    
    public Pracovnik getPracovnik(){
        Pracovnik copy = new Pracovnik(this.name,this.surname,this.startTime,this.finishTime, this.finalTime);
//        copy.club = this.club;
//        copy.sex = this.sex;
//        copy.tax = this.tax;
        copy.startTime = this.startTime;
        copy.finishTime = this.finishTime;
        
        return copy;
    }
    
    public void loadSeznamprac(File startFile) throws FileNotFoundException, IOException {
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
    
    @Override
    public int compareTo(Pracovnik z2){
        return this.surname.compareTo(z2.surname); 
    }
}
    public static void main(String[] args) {
    LocalDateTime myObj = LocalDateTime.now();
    System.out.println(myObj);
    }
}