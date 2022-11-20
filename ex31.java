package DomJudge.Domjudge;

import java.util.*;
/**
 * Write a description of class ex31 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ex31 {
    
    public static void main(String [] args){
         Scanner s = new Scanner(System.in).useLocale(Locale.US);
         
        while (s.hasNext() ){
            double a = s.nextDouble();
            double b = s.nextDouble();
            double c = s.nextDouble();
            
            double ir = b * b - 4 * a * c;
            double r = Math.sqrt(ir);
            double x1 = (-b+r)/(2*a);
            double x2 = (-b-r)/(2*a);
            
            if (a == 0.0) {
                if (b == 0.0) {
                       if (c == 0.0) {
                        System.out.printf("infinite solutions\n");
                       }else{
                        System.out.printf("undetermined\n");
                       }
                }else if (c == 0.0){
                    System.out.printf("%d %d %d  %.4f  first degree equation\n", (int) a, (int) b, (int) c, c);
                }else{
                    System.out.printf("%d %d %d  %.4f  first degree equation\n", (int) a, (int) b, (int) c, -c / b );
                }
            }else{
                if (ir >= 0.0){
                    if (r == 0.0){
                        System.out.printf("%.4f  double solution\n", x1);
                    }else{
                        System.out.printf("%.4f  and  %.4f\n",x1,x2);
                    }
                }else{
                    double sqrt = Math.sqrt(4 * a * c - b * b);
                    double real = -b / (2 * a);
                    double imag = sqrt / (2 * a);
                    if (b==0){
                        System.out.printf("%.4f + %.4fi  and  %.4f - %.4fi\n", Math.abs(real), imag, Math.abs(real), imag);
                    }else{
                    System.out.printf("%.4f + %.4fi  and  %.4f - %.4fi\n", real, imag, real, imag);
                    }
                }
            }   
        }
    }
}