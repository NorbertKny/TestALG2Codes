/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semestralproject; //UI

import java.util.Scanner;
import java.applet.AudioClip;
import java.io.BufferedInputStream;
/**
 *
 * @author norbert.roland.kny
 */
public class ProjectUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        System.out.println("Zadej: dd mm rrrr");
        int den = sc.nextInt();int mesic = sc.nextInt();int rok = sc.nextInt();
        //Calendar a = Calendar.getInstance(den, mesic, rok);
        //System.out.println(a.dayInMonth());
        do{
        //a.displayMonth();
        System.out.println("");
        System.out.println("Prikazy");
        System.out.println("(+) pro pusunuti kalendare dopredu");
        System.out.println("(-) pro posunuti dozadu");
        System.out.println("(x) pro ukonceni");
        String posun = sc.next();
        String q = posun.substring(0);
        
        if(q.startsWith("+")){
            //a.nextMonth();
        }
        if(q.startsWith("-")){
            //a.previousMonth();
        }
        
        if(q.startsWith("x")){
            System.exit(0);
        }
        
        }while(true);
    }
    
}
