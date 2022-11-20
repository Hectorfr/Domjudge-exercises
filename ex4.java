package DomJudge.Domjudge;

import java.util.*;

class ex4 {
    public static void main( String [] args) {
        Scanner input = new Scanner (System.in).useLocale(Locale.US);
        while (input.hasNext() ){
            float a = input.nextFloat();
            float b = input.nextFloat();
            double a1 = Math.round(a * 100000000.0) / 100000000.0;
            double b1 = Math.round(b * 100000000.0) / 100000000.0;
            double r = (a1 / b1);
            
            
            if (b == 0 && a >0) {
                System.out.printf("%17.7f / %17.7f =  Infinite\n", a,b);
            }
            else if (b == 0 && a < 0) {
                System.out.printf("%17.7f / %17.7f = -Infinite\n", a,b);
            }   
            else if (b == 0 && a == 0) {
                    System.out.printf("%17.7f / %17.7f =  Not a Number\n", a,b);
            }
            else {  
            System.out.printf("%17.7f / %17.7f = %17.7f%n", a,b,r);
            }
        }
    }
}