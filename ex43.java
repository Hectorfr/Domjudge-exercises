package DomJudge.Domjudge;
import java.util.*;

public class ex43 {
    
    public static void main(String [] args){    
        Scanner s = new Scanner(System.in);

        int [][] matrix, matrix1, matrixR;
        int c,r, r1, c1; 

        while (s.hasNext()){

            //compute 1st matrix
            r = s.nextInt();
            //System.out.println(r);
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

            if ( r == r1 && c == c1){
                //Do adittion of matrices and return sum
                //matrixR = new int [r1][c1];
                System.out.println(r1 + " " + c1);
                for (int i = 0; i < r; i++){
                    for (int j = 0; j < c; j++){
                        //matrixR[i][j] = matrix[i][j] + matrix1[i][j];
                        if (j == 0){System.out.printf(" %4d  ", matrix[i][j] + matrix1[i][j]);
                        }else if (j == c-1){System.out.printf("%4d ", matrix[i][j] + matrix1[i][j]);
                        }else {System.out.printf("%4d  ", matrix[i][j] + matrix1[i][j]);}

                    }
                    System.out.print("\n");
                }
            } else{
                System.out.println("Impossible to add two matrices of different dimensions!");
            }
        }
    }
}

//Difficulty in spaces needed for diferent outputs