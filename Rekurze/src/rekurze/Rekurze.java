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
        System.out.println(factorialkny(5));
        System.out.println(factorial(5));
        System.out.println(factorialRecursive(5));
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
    
    public static int factorial(int n){
        if(n<0){
            throw new IllegalArgumentException("Zadana zaporna hodnota");
        }
        int number=1;
        for (int i = 2; i <= n; i++) {
            number=number*i;
        }
        return number;
    }
    
    public static int factorialkny(int n){
        //n=5;
        int res=0;
        for (int i = 0; i < n+1; i++) {
            res += n*(n-1);
        }
        return res;
    }
    
    public static int factorialRecursive(int n){
        if(n<0){
            throw new IllegalArgumentException("Zadana zaporna hodnota");
        };
        if((n==1)||(n==0)){
            return 1;
        };
        return factorialRecursive(n-1)*n;
    }
    
    public static int max(int[] a,int i){
        if(a[a.length-2]>a[a.length-1]){
            i=a.length-2;
        }else{
            i=a.length-1;
        }
        return max(a,i);
    }
}
