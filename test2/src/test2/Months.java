/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package test2;

/**
 *
 * @author norbert.roland.kny
 */
public enum Months {
    JANUARY(1,31), FEBRUARY(2,28/29), DECEMBER(12,31);
    
    private int monthNumber;
    private int daysInMonth;
    
    private Months(int monthNumber, int daysInMonth){
        this.monthNumber = monthNumber;
        this.daysInMonth = daysInMonth;
    }
    
    public int getMonthNumber(){
        return monthNumber;
    }
    
    public int getDaysInMont(){
        return daysInMonth;
    }
    
    public static void setLeapYear(){
        Months.FEBRUARY.daysInMonth = 29;
    }
    
    public static void setNormalYear(){
        Months.FEBRUARY.daysInMonth = 28;
    }
}
