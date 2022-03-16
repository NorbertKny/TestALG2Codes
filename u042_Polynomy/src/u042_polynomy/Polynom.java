/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u042_polynomy;

import java.util.Arrays;

/**
 *
 * @author norbert.roland.kny
 */
public class Polynom {
    private int[]pole;
    
    public Polynom(int koef){
        pole = new int[1];
        pole[0] = koef;
    }
    
    public Polynom(int koef1,int koef0){
        pole = new int[2];
        pole[0] = koef1;
        pole[1] = koef0;
    }
    
    //uz otocene
    public Polynom(int[]a){
        //pole = new int[a.length];
        pole = Arrays.copyOf(a,a.length);
        /*for (int i = a.length-1; i >= 0; i--) {
            pole[i]=a[a.length-i-1];    
        }*/
    }
    
    //uz prevraceny
    /*public Polynom(int[]a){
    pole = new int[a.length];
        for (int i = a.length-1; i >= 0; i--) {
            pole[i]=a[a.length-i-1];    
        }
    }*/
    
    //nespravne otocene
    public static Polynom getInstanceFromReverted(int... a){
        int[]b =new int[a.length];
        for (int i = a.length-1; i >= 0; i--) {
            b[i]=a[a.length-i-1];    
        }
        return new Polynom(b);
    }
    
    public static Polynom getInstanceFromNonReverted(int... a){
        return new Polynom(a);
    }
    
    public static Polynom getInstanceFromRevertedArray(int... a){
        return getInstanceFromReverted(a);
    }
    
    public static Polynom getInstanceFromNonRevertedArray(int... a){
        return new Polynom(a);
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("");
        String vysledek = "";
        for (int i = pole.length-1; i >= 0; i--) {
            sb.append(pole[i]).append("x^").append(i).append(" ");   
        }
        return sb.toString();
    }
    
    /*public Polynom(int[]pole){
    this.pole=pole;
    }*/
}
