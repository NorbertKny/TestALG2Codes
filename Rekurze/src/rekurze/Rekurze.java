/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rekurze;

/**
 *
 * @author norbert.roland.kny
 */
public class Rekurze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    public static int mystery(int a,int b){ //3,11
        if(b==0){
            return 0;
        }
        if(b%2==0){
            return mystery(a+a,b/2);
        }
        return mystery(a+a,b/2)+a;
    }
    /*
    m(3,11) = m(6,5)+3 = 30+3 = 33
    m(6,5)  = m(12,2)+6 = 24+6 = 30
    m(12,2) = m(24,1) = 24
    m(24,1) = m(48,0)+24 = 0+24 = 24
    m(48,0) = 0
    */
    public static String mystery(int n){ //24
        String s;
        if(n<=1){
            return String.valueOf(n);
        }
        s=mystery(n/2)+String.valueOf(n%2);
        return s;
    }
    /*
    m(24)   = m(12)+con0 ==>11000     final pro m(24)=11000
    m(12)   = m(6)+con0  ==>1100
    m(6)    = m(3)+con0  ==>110
    m(3)    = m(1)+con1  ==>11
    m(1)    = 1          ==>1
    */
}
