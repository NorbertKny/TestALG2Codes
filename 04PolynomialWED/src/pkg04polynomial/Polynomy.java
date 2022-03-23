package pkg04polynomial;

public final class Polynomy {
    
    private Polynomy(){
        
    }

    public static Polynom sum(Polynom polynom, Polynom polynom2) {
        Polynom mensiPol = (polynom.length() < polynom2.length()) ? polynom : polynom2;
        Polynom vetsiPol = (polynom.length() >= polynom2.length()) ? polynom : polynom2;
        int[] polySoucet = new int[vetsiPol.length()];

        for (int i = 0; i < mensiPol.length(); i++) {
            polySoucet[i] = (polynom.getKoeff(i) + polynom2.getKoeff(i));
        }
        for (int i = mensiPol.length(); i < vetsiPol.length(); i++) {
            polySoucet[i] = (vetsiPol.getKoeff(i));
        }
        return Polynom.getInstanceFromNonRevertedArray(polySoucet);
    }

    public static Polynom multiply(Polynom polynom, Polynom polynom2) {
        int m = polynom.length();
        int n = polynom2.length();
        int[] polyNasobek = new int[m + n - 1];

        for (int i = 0; i < polynom.length(); i++) {
            for (int j = 0; j < polynom2.length(); j++) {
                polyNasobek[i + j] += polynom.getKoeff(i) * polynom2.getKoeff(j);
            }
        }
        return Polynom.getInstanceFromNonRevertedArray(polyNasobek);
    }

    public static int horner(Polynom polynom, int x) {
        int result = polynom.getKoeff(polynom.length()-1);
        for (int i = polynom.length()-2; i >= 0; i--) {
            result = result * x + polynom.getKoeff(i);
        }
        return result;
    }
    
    public static Polynom sumALL(Polynom...p){
        Polynom sum = p[0];
        for (int i = 1; i < p.length; i++) {
            sum = sum(sum,p[i]);
            
        }
        return sum;
    }

    public static void main(String[] args) {
        Polynom p1 = Polynom.getInstanceFromReverted(3, 2, 2);
        Polynom p2 = Polynom.getInstanceFromReverted(4, 2);
        Polynom pol = sum(p1, p2);
        System.out.println(p1 + " + " + p2);
        System.out.println(pol);
        Polynom pol2 = multiply(p1, p2);
        System.out.println(p1 + " * " + p2);
        System.out.println(pol2);
        int vysledek = horner(p1,3);
        System.out.println(vysledek);
    }

}
