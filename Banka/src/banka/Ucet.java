/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banka;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author norbert.roland.kny
 */
public class Ucet {
    private double prijem;
    private double vydej;
    private double bilance;
    private String name;
    private LocalDate timestamp;
    
    public Ucet(String name, double bilance){
        this.name=name;
        this.bilance=bilance;
    }
    
    public Ucet(String name){
        this.name=name;
    }

    public double getBilance() {
        return bilance;
    }

    public String getName() {
        return name;
    }

    public void setBilance(double bilance) {
        this.bilance = bilance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] addPrijem(double prijem) {
        bilance += prijem;
        timestamp = LocalDate.now();
        //String.format("%2d %10s",prijem,timestamp);
//    double[] getCoordinatesDoubleArray() {
        String strtimestamp = timestamp.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String strprijem = prijem.
        String[] coordinates = new String[2];
//
        coordinates[0] = prijem;
        coordinates[1] = neew;
//  
//    return coordinates;
//    }
        
        return coordinates;//prijem;
    }

    public double addVydej(double vydej) {
        bilance += vydej;
        timestamp = LocalDate.now();
        return vydej;
    }
    
//    public void printTimestamp() {
//        timestamp = LocalDate.parse(timestamp, DateTimeFormatter.ISO_DATE); //2022-02-02
//    }
    
    @Override
    public String toString() {
        return "Ucet{" + "name=" + name + ", bilance=" + bilance + '}';
    }
    
    
}
