/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kny;

import java.util.Scanner;

/**
 *
 * @author norbert.roland.kny
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Institute inst = new Institute("NY");
        do{
            System.out.println(inst.toString());
            System.out.println("Institute menu");
            System.out.println("");
            System.out.println("1. add station");
            System.out.println("2. delete station");
            System.out.println("3. add position of station");
            System.out.println("4. list stations by alphabet");
            System.out.println("5. list stations by position");
            System.out.println("6. find nearest station");
            System.out.println("");
            System.out.println("0. exit");
            int option = sc.nextInt();
            
            if(option == 0){
                System.exit(0);
            }
            
        }while(true);
    }
}
