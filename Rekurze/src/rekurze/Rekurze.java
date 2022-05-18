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
    public static int mystery(int a,int b){
        if(b==0){
            return 0;
        }
        if(b%2==0){
            return mystery(a+a,b/2);
        }
        return mystery(a+a,b/2)+a;
    }
    
}
