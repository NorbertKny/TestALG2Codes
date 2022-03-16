/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg004_bus;

import java.util.Scanner;

/**
 *
 * @author Norbik
 */
public class BusApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Bus tulBus = new Bus(41,15,"DPMLJ");
        int nastup, vystup;
        for (int i = 1; i < 6; i++) {
            if(i == 5){
                System.out.println(i+". zastavka. Konecna.");
                tulBus.getInfo();
                tulBus.KonecnaZastavka();
                System.out.println("");
                tulBus.getInfo();
            }else{
                System.out.println(i+". zastavka");
                tulBus.getInfo();
                System.out.println("Zadej kolik lidi chce vystoupit a kolik nastoupit:");
                vystup = sc.nextInt();nastup = sc.nextInt();
                if(vystup > tulBus.getCestujiciInt()){
                    System.out.println("Vystoupit mohlo jenom "+tulBus.getCestujiciInt());
                    vystup = tulBus.getCestujiciInt();
                }
                tulBus.CestujiciVystup(vystup);
                if( nastup > (tulBus.getSedadlaInt()-tulBus.getCestujiciInt()) ){
                    int volna_mista = (tulBus.getSedadlaInt()-tulBus.getCestujiciInt());
                    System.out.println("Nastoupit mohlo jenom "+volna_mista);
                    nastup = volna_mista;
                }
                tulBus.CestujiciNastup(nastup);
                tulBus.getInfo();
                System.out.println("");
            }   
        }
    }    
}
