/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg003_moneybox;

/**
 *
 * @author norbert.roland.kny
 */
public class MoneyBoxTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MoneyBox test = new MoneyBox("Petr");
        MoneyBox test2 = new MoneyBox("Lucas",5,3);
        System.out.println(test2.toString());
        test.setName("Gary");
        System.out.println(test.toString());
        test2.CoinSum();
        test.AddKoruna();
        test.AddDvoukoruna();
        System.out.println(test.toString());
        test.Add_koruny_dvoukoruny(2, 3);
        System.out.println(test.toString());
        System.out.println(test.getName());
    }
}
