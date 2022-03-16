/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u042_polynomy;

/**
 *
 * @author norbert.roland.kny
 */
public class PolynomTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Polynom test = new Polynom(2);    
        System.out.println(test.toString());
        Polynom test1 = new Polynom(3,2);    
        System.out.println(test1.toString());
        int[]a={1,2,3};
        Polynom test2 = new Polynom(a);    
        System.out.println(test2.toString());
        
        Polynom p0 = Polynom.getInstanceFromReverted(2,3,4,5);
    }
    
}
