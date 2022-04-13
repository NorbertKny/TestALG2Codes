/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u031_zavodnik;

import java.util.Comparator;
/**
 *
 * @author norbert.roland.kny
 */
public class ComparatorZavodnikByFinalTime implements Comparator<Zavodnik> {
    @Override
    public int compare(Zavodnik o1, Zavodnik o2){
        return o1.getFinalTime() - o2.getFinalTime();
//        if(o1.getFinalTime() > o2.getFinalTime()){
//            return 1;
//        }else if(o1.getFinalTime() < o2.getFinalTime()){
//            return -1;
//        }
//        return 0;
//        Double.compare(o1.getFinalTime(), o2.getFinalTime())
    }
}
