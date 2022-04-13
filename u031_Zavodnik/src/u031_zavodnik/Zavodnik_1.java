/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u031_zavodnik;

//import java.util.ArrayList;

import java.time.LocalDate;


/**
 *
 * @author norbert.roland.kny
 */
public class Zavodnik_1 implements Comparable<Zavodnik_1>{
    private String name;
    private String surname;
    
    private int startNumber;
    private int startTime;
    private int finishTime;
    private int finalTime;
    
    private String currentRace;
    private int yearOfBirth;
    private LocalDate dob;
    private boolean sex;
    private String club;
    private int wave;
    private boolean tax;
    private int rank;
    
    private static int startNumberCount = 1;
    
    
    public Zavodnik_1(String name,String surname){
        this.name = name;
        this.surname = surname;
        startNumber = startNumberCount = 1;
        startNumberCount++;
    }
    
    private Zavodnik_1(String name,String surname, int startNumber){
        this.name = name;
        this.surname = surname;
        this.startNumber = startNumber;

    }
    
    //**************************************************************************
    public String getName(){
        return name;
    }
    
    public String getSurname(){
        return surname;
    }
    
    public String getCurrentRace(){
        return currentRace;
    }
    
    public boolean getSex(){
        return sex;
        //1 male, 0 female
    }
    
//    public boolean getSex(){
//        return sex.toString().charAt(0);
//    }
    
    public String getClub(){
        return club;
    }
    
    public int getStartNumber(){
        return startNumber;
    }
    
    public int getStartTime(){
        return startTime;
    }
    
    public int getFinishTime(){
        return finishTime;
    }
    
    public int getFinalTime(){
        finalTime = finishTime - startTime;
        return finalTime;
//        if()
    }
    
    public int getYearOfBirth(){
        return yearOfBirth;
    }
    
    public int getWave(){
        return wave;
    }
    
    public int getRank(){
        return rank;
    }
    
    public boolean getTax(){
        return tax;
    }
    //**************************************************************************
    public void setTax(boolean tax){
        this.tax = tax;
    }
    
    public void setSex(boolean sex){
        this.sex = sex;
        //1 male, 0 female
    }
    
//    public void setSex(char sex){
//        if(sex =='f' || sex == 'F' |♀4 sex == 'w'){
//            this.sex = Sex.F;
//        }else{
//            this.sex = Sex.M;
//        }
//    }
    
     public void setName(String name){
        this.name = name;
    }
    
    public void setSurname(String surname){
        this.surname = surname;
    }
    
    public void setCurrentRace(String currentRace){
        this.currentRace = currentRace;
    }
    
    public void setClub(String club){
        this.club = club;
    }
    
    public void setStartNumber(int startNumber){
        this.startNumber = startNumber;
    }
    
    public void setStartTime(int startTime){
        this.startTime = startTime;
    }
    
    public void setFinishTime(int finishTime) throws StartTimeNotSet{
        if(startTime == 0){
            throw new StartTimeNotSet("nebyl jeste zadany cas startu");
        }
        this.finishTime = finishTime;
    }
    
    public void setFinalTime(int finalTime){
        this.finalTime = finalTime;
    }
    
    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }
    
    public void setWave(int wave){
        this.wave = wave;
    }
    
    public void setRank(int rank){
        this.rank = rank;
    }
    //--------------------------------------------------------------------------
    @Override
    public String toString(){
        //return String.format("%10s %10s %5d, %02d:%02d:%02d", name, surname, startNumber, finalTime);
        return String.format("%10s %10s %5d, %02", name, surname, startNumber, finalTime);
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
    
    public Zavodnik_1 getZavodnik(){
        Zavodnik_1 copy = new Zavodnik_1(this.name,this.surname,this.startNumber);
        copy.club = this.club;
        copy.sex = this.sex;
        copy.tax = this.tax;
        copy.startTime = this.startTime;
        copy.finishTime = this.finishTime;
        
        return copy;
    }
    
    @Override
    public int compareTo(Zavodnik_1 z2){
        return this.surname.compareTo(z2.surname); 
    }
    
    
}
