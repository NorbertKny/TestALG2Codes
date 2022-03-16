/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg004_bus;

/**
 *
 * @author Norbik
 */
public class Bus {
    private String spolecnost;
    private int sedadla;
    private int linka;
    private int cestujici;
    
    public Bus(int sedadla, int linka, String spolecnost, int cestujici){
        this.sedadla = sedadla;
        this.linka = linka;
        this.spolecnost = spolecnost;
        this.cestujici = cestujici;
    }
    
    public Bus(int sedadla, int linka, String spolecnost){
        this.sedadla = sedadla;
        this.linka = linka;
        this.spolecnost = spolecnost;
        this.cestujici = 0;
    }
    
    public Bus(){
        this.sedadla = 40;
        this.linka = 0;
        this.spolecnost = "";
        this.cestujici = 0;
    }
    
    public void setLinka(int linka) {
        this.linka = linka;
    }
    
    public void setSpolecnost(String spolecnost) {
        this.spolecnost = spolecnost;
    }
    
    public void getInfo(){
        System.out.println("Autobus číslo " +linka+ " společnosti " +spolecnost+ " s počtem sedadel "+sedadla+" veze "+cestujici+" cestujících.");
    }
    
    public String getLinka() {
        return "Linka " + linka;
    }
    
    public String getSpolecnost() {
        return "Spolecnost " + spolecnost;
    }
    
    public String getSedadla() {
        return "Pocet sedadel " + sedadla;
    }
    
    public int getSedadlaInt() {
        return sedadla;
    }
        
    public String getCestujici() {
        return "Pocet cestujicich " + cestujici;
    }
    
    public int getCestujiciInt() {
        return cestujici;
    }

    public void CestujiciNastup(int pocet){
        this.cestujici = cestujici + pocet;
    }
        public void CestujiciVystup(int pocet){
        this.cestujici = cestujici - pocet;
    }
        
    public void KonecnaZastavka(){
        this.cestujici = 0;
    }    
    /*@Override
    public String toString(){
        return "Bus {" + "cislo linky-" + linka + ", spolecnost-" + spolecnost + ", pocet sedadel-" + sedadla + ", pocet cestujicich-" + cestujici +"}";
    }*/
    /*public void CestujiciNastupSecure(int pocet){
        this.cestujici = cestujici + pocet;
    }*/
}
