package DomJudge.Domjudge;

import java.util.*;

public class ex41{


    public static void main(String [] args){
        Scanner s = new Scanner(System.in);

        double av, sd, max, min, med, sum = 0, mod;
        float [] arr;
        int size = s.nextInt(), count = 0;
        double varsum = 0, va;
        String trash = s.nextLine();

        arr = new float [size];


        // Get all values in array and get the sum for the average
        while (s.hasNextFloat()){
            arr[count] = s.nextFloat();
            sum += arr[count];
            count++;
        }
        av = sum /size;

        //assume it is the fisrt value
        min = arr[0];
        max = arr[0];

        for (int i = 0; i < size; i++){
            //go trough array and comute sum nedeed for va, and max and min
            varsum += Math.pow(arr[i] - av, 2);

            //Math.pow(arr[i] - av, 2); DOES NOT WORK, pow does not have float precision
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        va = (varsum / (size-1));
        sd = Math.sqrt(va);
        

        //Compute the median with unefficient sort method
        Arrays.sort(arr);
        if (size%2 == 0){
            med = (arr[size/2] + arr[size/2 - 1]) / 2;
        }else med = arr[size/2];
            


        //counters for mode
        int contador = 0;
        int maxCount = 0;
        mod = arr[0];
        
        //to compute the smallest mode possible i will use the arr sort we did previously
        for (int i = 0; i < size; i++){


            //compute unique mode
            //reset contador for each iteration 
            contador = 0;
            for (int j = i + 1; j < size; j++){
                if (arr[i] == arr[j]) {
                    contador++;
                    if (contador > maxCount){
                        maxCount = contador;
                        mod = arr[i];
                    }
                }
            }
        }

        System.out.printf("average: %.3f\n", av );
        System.out.printf("variance: %.3f\n", va);
        System.out.printf("standard deviation: %.3f\n",sd);
        System.out.printf("min and max: %.3f %.3f\n", min, max);
        System.out.printf("median: %.3f\n", med);
        System.out.printf("mode: %.3f\n", mod);

        /* ALGORITHM TO SOLVE MULTIPLE MODES

                    //array of int for counter of mode
                    int [] modeResults = new int[size];

                    for (int i = 0; i < size; i++){
                        //go trough array and compute mode (destroying second array)
                        int contador = 1;
                        if(arr[i] == -1){
                            modeResults[i]=0;
                        }else{
                            for (int j = i + 1; j < size; j++){
                                if (arr[i] == arr[j]) {contador++; arr[j] = -1;}
                            }
                            modeResults[i] = contador;
                        }
                    }

                    int m = modeResults[0];
                        
                    for (int i = 0; i < size; i++){
                        //System.out.println(modeResults[i]);
                        if (modeResults[i] >= m) m = modeResults[i];
                    }
                    for (int i = 0; i < size; i++){
                        if (modeResults[i] == m) System.out.printf(" %.3f", arr[i]);
                    }
                    System.out.printf("\n");
        */
    }


}




//Problem: Double has to much precision and float to little