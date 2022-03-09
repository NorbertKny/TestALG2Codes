/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg003_moneybox;

/**
 *
 * @author norbert.roland.kny
 */
public class MoneyBox {
    private String name;
    private int nOnes;
    private int nTwos;

    public MoneyBox(String name) {
        this.name = name;
    }

    public MoneyBox(String name, int nOnes, int nTwos) {
        this.name = name;
        this.nOnes = nOnes;
        this.nTwos = nTwos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MoneyBox{" + "name-" + name + ", nOnes-" + nOnes + ", nTwos-" + nTwos + "}";
    }

    public void CoinSum(){
        int sum = nOnes + (nTwos*2);
        System.out.println("Suma minci pokladnicky je " + sum);
    }
    
    public void AddKoruna(){
        this.nOnes = nOnes + 1;
    }
        public void AddDvoukoruna(){
        this.nTwos = nTwos + 1;
    }
        
    public void Add_koruny_dvoukoruny(int Njedna, int Ndva){
        this.nOnes = nOnes + Njedna;
        this.nTwos = nTwos + Ndva;
    }
    
    public void info(){
        int sum = nOnes + (nTwos*2);
        System.out.println(name + "ma v pokladnicce " + sum + "korun, -" + nOnes );
    }
}
