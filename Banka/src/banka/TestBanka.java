/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banka;

/**
 *
 * @author norbert.roland.kny
 */
public class TestBanka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ucet equa = new Ucet("Equa",0);
        System.out.println(equa.toString());
        
        System.out.println(equa.addPrijem(300.0));
        System.out.println(equa.getBilance());
        
        System.out.println(equa.addVydej(-149.0));
        System.out.println(equa.getBilance());
        
        System.out.println(equa.getName());
        System.out.println(equa.toString());
        System.out.println(equa.addVydej(-1.0));
        System.out.println(equa.toString());
    }    
}
