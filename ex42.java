package DomJudge.Domjudge;
import java.util.*;

public class ex42 {

    public static void main(String [] args){

        Scanner s = new Scanner(System.in);

        int size, scalar;
        double [] arr1, arr2;

        while (s.hasNext()){
            scalar = 0;
            size = s.nextInt();
            arr1 = new double [size];
            arr2 = new double [size];
            //System.out.println(size);
            
            for (int i = 0; i < size; i++){
                arr1[i] = s.nextDouble();
            }
            for (int i = 0; i < size; i++){
                arr2[i] = s.nextDouble();
            }
            for (int j = 0; j < size; j++){
                scalar += arr1[j]*arr2[j];
            }
            System.out.println(scalar);

        }
    }

}
