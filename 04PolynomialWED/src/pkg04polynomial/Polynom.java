package pkg04polynomial;

import java.util.Arrays;

public class Polynom {

    private int[] polekoeficientu;

    Polynom(int x0) {
        polekoeficientu = new int[1];
        polekoeficientu[0] = x0;
    }

    Polynom(int x1, int x0) {
        polekoeficientu = new int[2];
        polekoeficientu[0] = x0;
        polekoeficientu[1] = x1;
    }

    Polynom(int a[]) {
        polekoeficientu = Arrays.copyOf(a, a.length);
    }

    public static Polynom getInstanceFromReverted(int... a) {
        int[] b = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            b[i] = a[a.length - 1 - i];
        }
        return new Polynom(b);

    }

    public static Polynom getInstanceFromNonReverted(int... a) {
        return new Polynom(a);
    }

    public static Polynom getInstanceFromRevertedArray(int[] a) {
        return getInstanceFromReverted(a);
    }

    public static Polynom getInstanceFromNonRevertedArray(int[] a) {
        return new Polynom(a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("");
        for (int i = polekoeficientu.length - 1; i >= 0; i--) {
            sb.append(polekoeficientu[i]).append("x^").append(i).append(" ");
        }
        return sb.toString();
    }

    public int[] getPolynom() {
        return Arrays.copyOf(polekoeficientu, polekoeficientu.length);
    }

    public Polynom diff() {
        int[] tmp = new int[polekoeficientu.length - 1];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = polekoeficientu[i + 1] * (i + 1);
        }
        return new Polynom(tmp);
    }
    
    public int getKoeff(int exponent){
        return polekoeficientu[exponent];
    }
    
    public int length(){
        return polekoeficientu.length;
    }
    
    public int horner(int x) {
        int result = this.polekoeficientu[polekoeficientu.length-1];
        for (int i = polekoeficientu.length-2; i >= 0; i--) {
            result = result * x + polekoeficientu[i];
        }
        return result;
    }
        
    public static void main(String[] args) {

        Polynom p0 = Polynom.getInstanceFromReverted(2, 3, 4, 5);
        System.out.println(p0);

        Polynom p1 = new Polynom(2);
        System.out.println(p1.toString());
        Polynom p2 = new Polynom(2, 3);
        System.out.println(p2.toString());
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        Polynom p3 = new Polynom(a);
        Polynom p4 = new Polynom(b);
        System.out.println(p3.toString());
        System.out.println(p3.diff());

    }

}
