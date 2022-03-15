/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg004_bus;

/**
 *
 * @author Norbik
 */
public class BusTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bus novy = new Bus(40,3,"Arriva",17);
        novy.getInfo();
        novy.setLinka(69);
        novy.setSpolecnost("SuS");
        novy.getInfo();
        System.out.println(novy.getLinka());
        System.out.println(novy.getSpolecnost());
        System.out.println(novy.getSedadla());
        System.out.println(novy.getCestujici());
        
        Bus test = new Bus(20,15,"csaD");
        test.getInfo();
        
        Bus sus = new Bus();
        sus.getInfo();
        
        novy.getInfo();
        novy.CestujiciNastup(7);
        novy.getInfo();
        novy.CestujiciVystup(3);
        novy.getInfo();
        novy.KonecnaZastavka();
        novy.getInfo();
    }
}
