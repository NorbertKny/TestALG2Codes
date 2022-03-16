/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u042_polynomy;

/**
 *
 * @author norbert.roland.kny
 */
public class PolynomTools {
    //scitani
    //pole a 1 2 3 4 5 means 5x4 4x3 3x2 2x1 1x0
    //pole b 7 7 7 7 7 means 7x4 7x3 7x2 7x1 7x0
    //soucet 8 9 10 11 12    12x4 11x3 10x2 9x1 8x0
    public static void sum(int[] polynom1, int[] polynom2){
        int l=(polynom1.length > polynom2.length)?polynom1.length:polynom2.length;
        Polynom mensiPol = (polynom1.length < polynom2.length)?polynom1.length:polynom2.length;
        int[] polySoucet = new int[l];
        for (int i = 1; i > 0; i--) {
            if(i < (l-lmensi)){ 
                polySoucet[i-1]=polynom1[polynom1.length-i]+polynom2[polynom2.length-i];
            }else{
                polysoucet[i-1] = 
            }    
        }
    }
}
