package DomJudge.Domjudge;
import java.util.*;


public class ex36 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in).useLocale(Locale.US); 

        long N, count = 0, i = 2, sq;
        boolean b = false;

        while (s.hasNextLong()){

            N = s.nextLong();

            // Reset values to default for every iteration
            i = 2;
            b = false;

            sq = (int)Math.sqrt(N);

            while (i <= sq){
                if (N % i == 0){b = true;}
                i++;
            }
            if (N == 1 || N == 0){b=true;}
            if (b == false) count++;
        
        }
        if (count==0){
            System.out.print("No prime numbers were found!\n");
        }else if (count==1){
            System.out.print("Only one prime number was found!\n");
        }else{
            System.out.printf("%d prime numbers were found!\n", count);
        }
   }
}
