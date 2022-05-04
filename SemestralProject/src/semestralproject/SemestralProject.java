/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semestralproject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

/**
 *
 * @author norbert.roland.kny
 */
public class SemestralProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        LocalDateTime myObj1 = LocalDateTime.now();
        LocalTime myObj2 = LocalTime.now();
        LocalDate myObj3 = LocalDate.now();
        System.out.println(myObj1);
        System.out.println(myObj2);
        System.out.println(myObj3);
//        BufferedWriter out = new BufferedWriter(new FileWriter("seznamprac.txt"));
//// na soubor existuje pouze jedna reference
//// reference na instanci FileWriter není k dispozici
//// zápis do souboru
//// uzavření souboru
//        int choose = sc.nextInt();
//        if(choose == 0){
//            out.close();
//        }
    } 
}
