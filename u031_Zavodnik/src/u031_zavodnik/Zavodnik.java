/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u031_zavodnik;

/**
 *
 * @author norbert.roland.kny
 */
public class Zavodnik {
    private String name;
    private String surname;
    
    private int startNumber;
    private int startTime;
    private int finishTime;
    private int finalTime;
    
    private String currentRace;
    private int yearOfBirth;
    private String sex;
    private String club;
    private int wave;
    private boolean tax;
    private int rank;
    
    public Zavodnik(String name,String surname){
        this.name = name;
        this.surname = surname;
//        this.yearOfBirth = yearOfBirth;
//        this.startNumber = startNumber;
//        this.startTime = startTime;
//        this.finishTime = finishTime;
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
    
    public String getSex(){
        return sex;
    }
    
    public String getClub(){
        return club;
    }
    
    public int getStartNumber(){
        return startNumber;
    }
    //**************************************************************************
    public void setTax(boolean tax){
        this.tax = tax;
    }
    
    public void setSex(String sex){
        this.sex = sex;
    }
        
    
        
}
