
import java.util.*;


public class ex33 {
       public static void main(String [] args){
            Scanner s = new Scanner(System.in).useLocale(Locale.US); 
        
            long N, reverse = 0, module;
           
            while (s.hasNextLong()){

            N = s.nextLong();
            reverse = 0;
                while (N != 0){
                    module = N%10;
                    reverse = reverse*10 + module;
                    N = N/10;
                }
                System.out.print(reverse + "\n");

            }
       }
}
