/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg05Calendar;

import java.util.Scanner;

/**
 *
 * @author iakov.timofeev
 */
public class CalendarApp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Zadej: dd mm rrrr");
        int den = sc.nextInt();int mesic = sc.nextInt();int rok = sc.nextInt();
        Calendar a = Calendar.getInstance(den, mesic, rok);
        //System.out.println(a.dayInMonth());
        do{
        a.displayMonth();
        System.out.println("");
        System.out.println("Prikazy");
        System.out.println("(+) pro pusunuti kalendare dopredu");
        System.out.println("(-) pro posunuti dozadu");
        System.out.println("(x) pro ukonceni");
        String posun = sc.next();
        //char znamenko = posun.CharAt(0);
        String q = posun.substring(0);
        
        if(q.startsWith("+")){
            a.nextMonth();
        }
        if(q.startsWith("-")){
            a.previousMonth();
        }
        
        if(q.startsWith("x")){
            System.exit(0);
        }
        
        }while(true);
        //System.out.println(a.isLeap());
    }
}
