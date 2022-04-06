/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u031_zavodnik;

/**
 *
 * @author norbert.roland.kny
 */
public class ZavodnikTest1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Zavodnik test = new Zavodnik("Petr","Adam");
        System.out.println(test.getName());
        System.out.println(test.getSurname());
        
        test.setStartTime(5665);
        System.out.println(test.getStartTime());
        System.out.println(test.ReadableStartTime(test.getStartTime()));
        System.out.println("");
        test.setFinishTime(8269);
        System.out.println(test.getFinishTime());
        System.out.println(test.ReadableFinishTime(test.getFinishTime()));
        System.out.println("");
        System.out.println(test.getFinalTime());
        System.out.println(test.ReadableFinalTime(test.getFinalTime()));
//        int time = 3672;
//        int hour = time/3600;
//        int min = (time%3600)/60;
//        int sec = time - (hour*3600)-(min*60);
//        
//        System.out.println(time);
//        System.out.println(hour);
//        System.out.println(min);
//        System.out.println(sec);
    }
}
