/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tul.kny._fraction;

/**
 *
 * @author Norbik
 */
public class Fraction {
    private int citatel;
    private int jmenovatel;
    
    public Fraction(int a, int b) {
        //citatel = a;
        //jmenovatel = b;
        
        int u = a;
        int w = b;
        while (w != 0){
            int r = u % w;
            u = w;
            w = r;
        }
        a = a/u;
        b = b/u;
        citatel = a;
        jmenovatel = b;
    }
    
    public Fraction(String s){
        String[] ss = s.split("/");
        citatel = Integer.parseInt(ss[0]);
        jmenovatel = Integer.parseInt(ss[1]);
        
        int u = citatel;
        int w = jmenovatel;
        while (w != 0){
            int r = u % w;
            u = w;
            w = r;
        }
        citatel = citatel/u;
        jmenovatel = jmenovatel/u;
    }
    
    public int getCitatel(){
        return citatel;
    }
    
    public int getJmenovatel(){
        return jmenovatel;
    }
    
    public double getHodnota(){
        double h = (double) citatel/jmenovatel;
        return h;
    }
    
    @Override
    public String toString(){
        if(citatel == jmenovatel){
            return "1";
        } else {
            return String.format("%d/%d", citatel, jmenovatel);
        }
    }
}

