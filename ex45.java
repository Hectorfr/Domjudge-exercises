package DomJudge.Domjudge;
import java.util.*;

public class ex45 {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);

        int size;
        double [][] matrix;
        double [] solution, vector;



        while (s.hasNext()){
            size = s.nextInt();
            //System.out.println(size);
            //halfMatrix = new int[size*(size+1) /2];


            matrix = new double [size][size];
            for (int i = 0; i < size; i++){
                for (int j = 0; j < size; j++){
                    if (i > j){matrix[i][j] = 0;

                    }else{matrix[i][j] = s.nextInt();
                        //System.out.println(matrix[i][j]);
                    }
                }
            }
            vector = new double [size];
            for (int i = 0; i < size; i++){
                vector[i] = s.nextInt();
                //System.out.println(vector[i]);

            }


            solution  = new double [size];
            //compute first solution
            solution[size-1] = vector[size-1] / matrix[size-1][size-1];
            //summatory auxaliary var
            double sum = 0;

            for (int i = size-2; i >= 0; i--){
                for (int j = 0; j < size-i-1; j++){
                    sum += matrix[i][size-j-1] * solution[size-j-1];
                    //System.out.println(matrix[i][size-j-1]);
                    //System.out.println(solution[size-j-1]);

                }
                solution[i] = (vector[i] - sum) / matrix[i][i];
                sum = 0;
                //System.out.println(solution[i]);

                //System.out.println(matrix[i][i]);
            }


        
            System.out.printf("%d: ", size);

            for (int i = 0; i < size; i++){
                if (i == size-1) {
                    double x = solution[i];
                    System.out.printf("%.5f\n", x);
                }else{
                    double x = solution[i];
                    System.out.printf("%.5f ", x);
                }
            }
        }


    }
}

//Check video of precisions in java