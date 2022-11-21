import java.util.*;

public class ex38 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in).useLocale(Locale.US);
        
        float x, y, equation, A, B, C;
        int quadrant = 0, jedi = 0, darkSide = 0, border = 0;

        A = s.nextFloat();
        B = s.nextFloat();
        C = s.nextFloat();

        while(s.hasNextFloat()){
            x = s.nextFloat();
            y = s.nextFloat();

            equation = A*x+B*y+C;
            
            if (equation <= 1 && equation >= -1){
                quadrant = 0;
            }else if (equation > 1){
                quadrant = 1;
            }else if (equation < -1){
                quadrant = -1;
            }
            switch (quadrant){
                case 0: border++;
                break;
                case 1: jedi++;
                break;
                case -1: darkSide++;
                break;
            }
        }
        System.out.printf("%7d May the Force be with you!\n", jedi);
        System.out.printf("%7d Fear is the path to the dark side. Fear leads to anger. Anger leads to hate. Hate leads to suffering. Suffering leads to the dark side.\n", border);
        System.out.printf("%7d Good! Your hate has made you powerful. Now, fulfill your destiny and take your father's place at my side!\n", darkSide);

    }
}
