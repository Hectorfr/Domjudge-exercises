package DomJudge.Domjudge;
import java.util.*;

public class ex5 {
    public static int countWordsUsingSplit(String input){
        if (input == null || input.isEmpty()){
            return 0; 
            }
        String[] words = input.split("\\s+");
        return words.length; 
    }

    public static void main(String [] args){
        /** System.out.println("Introduce el texto a analizar: "); */
        int count = 0;
        Scanner s = new Scanner(System.in).useLocale(Locale.US);
        while (s.hasNext() ){
            String out = s.nextLine();
            count ++;
            System.out.printf("%17S words \n",(countWordsUsingSplit(out)+count-1));
            System.out.printf("%17S lines \n",(count));
            /** String out = s.nextLine();
            String l1 = out.replace(" ", "");
            int lfinal = l1.length();
            System.out.println(lfinal); */
            }   
    }
}