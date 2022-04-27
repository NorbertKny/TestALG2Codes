/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kny;

import java.util.ArrayList;

/**
 *
 * @author norbert.roland.kny
 */
public class Institute {
    String name;
    ArrayList StationS = new ArrayList();
    
    public Institute(String name){
        this.name=name;
    }
    
    public Institute(String name,ArrayList StationS){
        this.name=name;
        this.StationS=StationS;   
    }

    @Override
    public String toString() {
        return "Institute{" + "name=" + name + '}';
    }
    
    public static void main(String[] args) {
        Institute anger = new Institute("Why");
        System.out.println(anger);
    }
}
