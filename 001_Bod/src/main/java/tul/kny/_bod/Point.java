/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tul.kny._bod;

/**
 *
 * @author Norbik
 */
public class Point {
    //data, instancni promenne,clenske promene, atributy, fields
    private double x;
    private double y;
    
    //metody
    //konstruktor
    public Point(){
        x = 0.0;
        y = 0.0;
    }
    //pretizeny overloaded konstruktor
    /*Point(int n1, int n2){
        x = n1;
        y = n2;
    }*/
    //pretizeny overloaded konstruktor
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    //[2,3]
    //textova reprezentace objektu
    //prekryti metody
    @Override
    public String toString(){
        return String.format("[%.2f,%.2f]",x,y);
    }
    
    public double distanceFromOrigin(){
        return Math.sqrt(Math.pow(x-0,2) + Math.pow(y-0,2));
        //return distanceFrom(0,0);
    }
    
    public double distanceFrom(double x, double y){
        return Math.sqrt(Math.pow(this.x-x,2) + Math.pow(this.y-y,2));
    }
    
    public double distanceFrom(Point p){
        return Math.hypot(this.x-p.x, this.y-p.y);
        //return distanceFrom(p.x, p.y);
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
}
