/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tul.kny._bod;

/**
 *
 * @author Norbik
 */
public class TestPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Point myPoint = new Point();
        System.out.println(myPoint.toString());
        Point yourPoint = new Point(3,4);
        System.out.println(yourPoint.toString());
        System.out.println(yourPoint); //println automaticky vola toString metodu
        
        System.out.println(myPoint.distanceFromOrigin());
        System.out.println(yourPoint.distanceFromOrigin());
        
        System.out.println(myPoint.distanceFrom(yourPoint));
        
        System.out.println(myPoint.getX());
    }    
}
