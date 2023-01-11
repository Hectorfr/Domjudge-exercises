package DomJudge.Domjudge;
import java.util.*;

public class ex44 {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);

        int [][] matrix, matrix1, matrixR;
        int c,r, r1, c1; 

        while (s.hasNext()){

            //compute 1st matrix
            r = s.nextInt();
            c = s.nextInt();
            matrix = new int [r][c];

            for (int i = 0; i < r; i++){
                for (int j = 0; j < c; j++){
                    matrix[i][j] = s.nextInt();
                }
            }

            //compute 2nd matrix
            r1 = s.nextInt();
            c1 = s.nextInt();
            matrix1 = new int [r1][c1];
            for (int i = 0; i < r1; i++){
                for (int j = 0; j < c1; j++){
                    matrix1[i][j] = s.nextInt();
                }
            }

            if ( c == r1){
                //Do product of matrices and return it
                matrixR = new int [r][c1];
                System.out.println(r + " " + c1);
                for (int i = 0; i < r; i++){
                    for (int j = 0; j < c1; j++){

                        matrixR[i][j] = 0;

                        for (int k = 0; k < c; k++) {
                            matrixR[i][j] += matrix[i][k] * matrix1[k][j];
                        }
                        if (j == 0){System.out.printf(" %5d  ", matrixR[i][j]);
                        }else if (j == c1-1){System.out.printf("%5d ", matrixR[i][j]);
                        }else {System.out.printf("%5d  ", matrixR[i][j]);}
                    }
                    System.out.print("\n");
                }
            } else{
                System.out.println("Number of columns of first matrix is not equal to the number of rows of the second one!");
            }
        }
    }
}
