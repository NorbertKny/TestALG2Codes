/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg05Calendar;

/**
 *
 * @author iakov.timofeev
 */
public class Calendar {
    private int day;
    private int month;
    private int year;
    
    private Calendar(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public static Calendar getInstance(int day, int month, int year){
        if(year <= 0){
            return null;
        } else if(month <= 0 | month > 12){
            return null;
        } else if(day <= 0 | day > 31){
            return null;
        } else if(month == 2 && day > 28){
            return null;
        } else if(month == 4 | month == 6 | month == 9 | month == 11 && day > 30){
            return null;
        } else {
            return new Calendar(day, month, year);
        }
    }
    public void nextMonth(){
        day = 1;
        month++;
        if(month > 12){
            year++;
            month = 1;
        }
    }
    public int dayInMonth(){
        //0=sobota ... 6=pátek
        int q=day;
        int m=month;
        int K=year%100;
        int J=year/100;
        return (q+13*(m+1)/5+K+(K/4)+(J/4)-2*J)%7;
    }

    
    public boolean isLeap() {
        boolean prestupny = false;
        if( (year % 100 == 0) && (year % 400 == 0) && (year % 4 == 0) ){
            prestupny = true;
        }
        return prestupny;
    }
    public int firstDayInMonth(){
        int q=1;
        int m=month;
        int K=year%100;
        int J=year/100;
        return (q+13*(m+1)/5+K+(K/4)+(J/4)-2*J)%7;
    }
    
    public void previousMonth(){
        this.day=1;
        if (this.month==1){
        this.month=12;
        this.year--;
        }else{
        this.month--;
        }
        //až bude displayMonth existovat, odkomentovat
        //displayMonth()
    }
    
    public void displayMonth()
    {
        String[] daysInWeek = new String[]{"Mo", "Tu", "We","Th","Fr","Sa","Su"};
        int[] daysInNums = new int[]{2, 3, 4, 5, 6, 0, 1};
        int[] daysInMonth = new int[]{31,1,31,30,31,30,31,31,30,31,30,31};
        System.out.print(" ");
        for (int i = 0; i < daysInWeek.length; i++) {
            System.out.print(daysInWeek[i] + " ");
        }
        System.out.println("");

        int dayInWeek = dayInMonth();
        int currentDay = 1;
        int maxDays = 0;
        
        if (month != 2)
        {
            maxDays = daysInMonth[month-1];
        }
        else
        {
            if (isLeap())
            {
                maxDays = 29;
            }
            else
            {
                maxDays = 28;
            }
        }
        boolean firstWritten = false;
        for (int i = 0; i < 5; i++) {
            System.out.print(" ");
            
            for (int j = 0; j < 7; j++) {
                if (i == 0)
                {
                    if (daysInNums[j] != dayInWeek && !firstWritten)
                    {
                        System.out.print("  ");
                    }
                    else
                    {
                        System.out.print(" " + currentDay);
                        firstWritten = true;
                    }
                }
                else if (currentDay <= maxDays)
                {
                    if (currentDay < 10)
                    {
                        System.out.print(" " + currentDay);
                    }
                    else
                    {
                        System.out.print(currentDay);
                    }
                }
                else
                {
                    break;
                }
            if (firstWritten)
            {
                currentDay++;
            }        
            System.out.print(" ");
            }
            System.out.println("");
        }
        
        

    }
}
