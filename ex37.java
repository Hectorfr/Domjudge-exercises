import java.util.*;

public class ex37 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in).useLocale(Locale.US);

        float x, y;
        int quadrant = 0;

        while(s.hasNextLong()){
            x = s.nextLong();
            y = s.nextLong();

            
            if (x == 0 && y == 0){
                quadrant = 0;
            }else if (x == 0 || y == 0){
                if (x == 0) quadrant = 10;
                else if (y == 0) quadrant = 20;
            } if (x > 0){
                if (y > 0) quadrant = 1;
                else if (y < 0) quadrant = 4;
            }else if (x < 0){
                if (y > 0) quadrant = 2;
                else if (y < 0) quadrant = 3;
            }
            switch (quadrant){
                case 0: System.out.printf(" ( %.2f, %.2f ) is located at the origin of coordinates\n", x, y);
                break;
                case 1: System.out.printf(" ( %.2f, %.2f ) is located in the first quadrant\n", x, y);
                break;
                case 2: System.out.printf(" ( %.2f, %.2f ) is located in the second quadrant\n", x, y);
                break;
                case 3: System.out.printf(" ( %.2f, %.2f ) is located in the third quadrant\n", x, y);
                break;
                case 4: System.out.printf(" ( %.2f, %.2f ) is located in the fourth quadrant\n", x, y);
                break;
                case 10: System.out.printf(" ( %.2f, %.2f ) is located over the y-axis\n", x, y);
                break;
                case 20: System.out.printf(" ( %.2f, %.2f ) is located over the x-axis\n", x, y);
                break;

            }
        }
    }
}
