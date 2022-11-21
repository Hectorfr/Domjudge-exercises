
import java.util.*;

public class ex35 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in).useLocale(Locale.US); 
    
        long N, sum = 0, module, temp;
       
        while (s.hasNextLong()){

        N = s.nextLong();
        temp = N;
        sum = 0;
            while (temp != 0){
                module = temp % 10;
                sum = sum + module;
                temp = temp/10;
            }
            if (sum % 9 == 0) System.out.print(N + "\n");

        }
   }
}
