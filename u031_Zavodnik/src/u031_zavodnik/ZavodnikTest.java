/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u031_zavodnik;

/**
 *
 * @author norbert.roland.kny
 */
public class ZavodnikTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Zavodnik test = new Zavodnik("Petr","Adam");
        System.out.println(test.getName());
        System.out.println(test.getSurname());
    }
}
