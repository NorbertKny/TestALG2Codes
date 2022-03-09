/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tul.kny._fraction;

/**
 *
 * @author Norbik
 */
public class FractionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fraction fr1 = new Fraction(2, 6);
        System.out.println(fr1.toString());
        System.out.println(fr1.getCitatel());
        System.out.println(fr1.getJmenovatel());
        System.out.println(fr1.getHodnota());
        
        Fraction fr2 = new Fraction("2/6");
        System.out.println(fr2.toString());
        System.out.println(fr2.getCitatel());
        System.out.println(fr2.getJmenovatel());
    }   
}
