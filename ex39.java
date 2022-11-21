import java.util.*;

public class ex39 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in).useLocale(Locale.US);
        
        float x, y, influence = 0, A, B, C;
        int risk = 0;

        A = s.nextFloat();
        B = s.nextFloat();
        C = s.nextFloat();

        while(s.hasNextFloat()){
            x = s.nextFloat();
            y = s.nextFloat();
            influence = 
            equation = A*x+B*y+C;
            
            if (equation <= 1 && equation >= -1){
                risk = 0;
            }else if (equation > 1){
                risk = 1;
            }else if (equation < -1){
                risk = -1;
            }
            switch (risk){
                case 1: System.out.printf("mortal at (%.2f,%.2f,%.2f) is protected", A,B,C);
                break;
                case 0: System.out.printf("mortal at (%.2f,%.2f,%.2f) is in no man\'s land", A,B,C);
                break;
                case -1: System.out.printf("mortal at (%.2f,%.2f,%.2f) is in danger", A,B,C);
                break;
            }
        }
    }
}
