/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kny;

/**
 *
 * @author norbert.roland.kny
 */
public class Station{
    String name;
    double longitude;
    double latitude;
    
    public Station(String name){
        this.name=name;
    }
    
    public Station(String name,double longitude,double latitude)throws Exception{
        this.name=name;
        this.longitude=longitude;
        this.latitude=latitude;
        if(longitude < -180 || longitude > 180){
            throw new Exception("Varovani, neplatna longitude");//System.out.println("Varovani, neplatna longitude");
        }else if(latitude < -90 || latitude > 90){
            throw new Exception("Varovani, neplatna latitude");//System.out.println("Varovani, neplatna latitude");
        }
    }
    //longtitude= -180 180
    //longtitude= -90 90

    public void setLongitude(double longitude)throws Exception{
        this.longitude = longitude;
        if(longitude < -180 || longitude > 180){
            throw new Exception("Varovani, neplatna longitude");
        }
    }

    public void setLatitude(double latitude)throws Exception{
        this.latitude = latitude;
        if(latitude < -90 || latitude > 90){
            throw new Exception("Varovani, neplatna latitude");
        }
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }
    
    public double distanceFrom(double longitude,double latitude){
        double long1 = this.longitude; //long statice pro kterou volame distanceFrom
        double lat1 = this.latitude;   //lat statice pro kterou volame distanceFrom
        double long2 = longitude;
        double lat2 = latitude;
        
        double radlong1 = Math.toRadians(long1);
        double radlat1 = Math.toRadians(lat1);
        double radlong2 = Math.toRadians(long2);
        double radlat2 = Math.toRadians(lat2);
        
        double d = 2*6371*Math.asin(Math.sqrt(Math.pow(Math.sin((radlat2-radlat1)/2), 2)+Math.cos(radlat1)+Math.cos(radlat2)*Math.pow(Math.sin((radlong2-radlong1)/2), 2)));
        //Math.pow(Math.sin((radlat2-radlat1)/2), 2)+Math.cos(radlat1)+Math.cos(radlat2)*Math.pow(Math.sin((radlong2-radlong1)/2), 2)
        return d; 
    }
    
    @Override
    public String toString() {
        return "Station{" + "name=" + name + ", longitude=" + longitude + ", latitude=" + latitude + '}';
    }
    
    public static void main(String[] args) {
        //Station test = new Station("Paris1",50,30);
        //System.out.println(test.getLongitude());
        //System.out.println(test.getLatitude());
        //System.out.println(test.distanceFrom(10,10));
    }
}
//implementace Comparable hodí chybu class not abstract