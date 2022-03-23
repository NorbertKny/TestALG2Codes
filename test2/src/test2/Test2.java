/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.util.Scanner;

/**
 *
 * @author norbert.roland.kny
 */
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Hello world");
        //double pie = Math.PI;
        //String s = "";
        //very sus
        //getDatum ==> datum ==> urci prestupnoat
        int datum = 1600;
        boolean prestupny = false;
        if( (datum % 100 == 0) && (datum % 400 == 0) && (datum % 4 == 0) ){
            prestupny = true;
        }
        System.out.println(prestupny);
        
        public static boolean isLeap(int datum) {
            boolean prestupny = false;
            if( (datum % 100 == 0) && (datum % 400 == 0) && (datum % 4 == 0) ){
                prestupny = true;
            }
        return prestupny;
        }
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Zadej: dd mm rrrr");
        int den = sc.nextInt();int mesic = sc.nextInt();int rok = sc.nextInt();
        Calendar a = Calendar.getInstance(den, mesic, rok);
        //System.out.println(a.dayInMonth());
        do{
        a.displayMonth();
        System.out.println("");
        System.out.println("Prikazy");
        System.out.println("(+) pro pusunuti kalendare dopredu");
        System.out.println("(-) pro posunuti dozadu");
        System.out.println("(x) pro ukonceni");
        String posun = sc.next();
        //char znamenko = posun.CharAt(0);
        String q = posun.substring(0);
        
        if(q.startsWith("+")){
            a.nextMonth();
        }
        if(q.startsWith("-")){
            a.previousMonth();
        }
        
        if(q.startsWith("x")){
            System.exit(0);
        }
        
        }while(true);
        //System.out.println(a.isLeap());
    }
        
    }
}
