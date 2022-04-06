/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u031_zavodnik;

import java.util.Scanner;

/**
 *
 * @author norbert.roland.kny
 */
public class ZavodApp {
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    
    public static void setStartTime(){
        System.out.println("Zadej zacatek startu: ");
        String input = sc.next();
    }
    
    public static void printRegistrujZavodnik(){
        ArrayList<Zavodnik> copy = zavod.sortByName();
        
        for (Zavodnik runner : copy){
            System.out.println("%3d. %10s. %10s. %15s\n", zavodnik.getStartNumber(),zavodnik.get);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //registerZavodnik();
//      public getZavodnik(){
//   
//      }
//      Scanner sc = new Scanner(System.in);
//      private static
//      System.out.println("Zadejte zacatek startu:");
//      String input = sc.next();
    }
}
