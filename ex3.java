package DomJudge.Domjudge;

import java.util.*;

class ex3 {
    public static void main( String [] args){
        Scanner input = new Scanner( System.in ).useLocale( Locale.US); 
        while( input.hasNext() ){
            float a = input.nextFloat();
            float b = input.nextFloat();
            float r = a + b;
            
            System.out.printf("%.3f + %.3f = %.3f%n",a,b,r);
            //System.out.println(a + " + "+ b + "= " + (a+b) );
        }
    }
}
