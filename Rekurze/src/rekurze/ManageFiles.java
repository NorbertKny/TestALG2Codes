/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rekurze;

import java.io.File;

/**
 *
 * @author norbert.roland.kny
 */
public class ManageFiles {
    public static String mf(File in,int mezery){
        if(in.exists()){//slozka/file.se
            File[] a = in.listFiles();
            String mez ="";
            for (int i = 0; i < mezery; i++) {
                mez += "   ";              
            }
            String s = mez + in.getName() + "\n";
            if(a!=null){
                for(int i = 0; i < a.length; i++) {
                    s += /*mez +*/ mf(a[i],mezery+1) + "\n";
                }
            }
            return s;
        }
        return "nenalezen";
    }
    
    public static void main(String[] args) {
        File in = new File(System.getProperty("user.dir"));
        //System.getProperty("user.dir")
        System.out.println(mf(in,0));
    }
}
