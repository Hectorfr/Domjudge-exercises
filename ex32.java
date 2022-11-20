package DomJudge.Domjudge;

import java.util.*;


public class ex32 {
       public static void main(String [] args){
           Scanner s = new Scanner(System.in).useLocale(Locale.US); 
           
           String W, S, out = "";
           int N, spaces = 0;
           double parameter2 = 0, middle;
        
           W = s.nextLine();
           N = Integer.parseInt(s.nextLine());
           S = s.nextLine();
    
           switch (W){
                case "square":
                    for (int i = 0 ; i < N ; i++) {
                        System.out.printf("\n");
                        for (int p = 0 ; p < (N*2) ; p++) {
                            System.out.printf(S);
                        }
                    }
                    break;
                
                case "triangle":
                    for (int i = 0 ; i < N ; i++) {
                        System.out.printf("\n");
                        spaces = N+i;
                        out = "";
                        for (int p = 0; p < 2*i+1; p++) {
                            out += S;
                            if  (p == 2*i) System.out.printf("%" + spaces +"s",out);
                        }
                    }
                    break;
                    
                case "down-arrow":
                    for (int i = N ; i > 0; i--) {
                        System.out.printf("\n");
                        spaces = N+i-1;
                        out = "";
                        for (int p = 0; p < 2*i-1; p++) {
                            out += S;
                            if  (p == 2*i-2) System.out.printf("%" + spaces +"s",out);
                        }
                    }
                    break;

                case "left-arrow":
                    middle = (2*N -1)/2.0;
                    for (int i = 0 ; i < (2*N -1); i++) {
                        System.out.printf("\n");
                        spaces = 2*N-1;
                        out = "";
                        if (i <= middle){
                            for (int p = 0; p < 2*i+1; p++) {
                              out += S;
                                if  (p == 2*i) System.out.printf("%" + spaces +"s",out);
                            }
                        }else if (i > middle){
                            parameter2 = (middle + (middle-1) - ((i - middle)*2.0));
                            for (int p = 0; p < parameter2; p++) {
                                out += S;
                                if  (p == parameter2-1) System.out.printf("%" + spaces +"s",out);
                            }
                        }
                    }   
                    break;

                case "right-arrow":
                    middle = (2*N -1)/2.0;
                    for (int i = 0 ; i < (2*N -1); i++) {
                        System.out.printf("\n");
                        spaces = 2*N-1;
                        out = "";
                        if (i <= middle){
                            for (int p = 0; p < 2*i+1; p++) {
                                out += S;
                                if  (p == 2*i) System.out.printf("%-" + spaces +"s",out);
                            }
                        }else if (i > middle){
                            parameter2 = (middle + (middle-1) - ((i - middle)*2.0));
                            for (int p = 0; p < parameter2; p++) {
                                out += S;
                                if  (p == parameter2-1) System.out.printf("%-" + spaces +"s",out);
                            }
                        }
                    }
                    break;


                case "diamond":
                    middle = (2*N - 1)/2.0;
                    for (int i = 0 ; i < middle ; i++) {
                        System.out.printf("\n");
                        out = "";
                        spaces = (N+i);
                            for (int p = 0; p < 2*i+1; p++) {
                                out += S;
                                if  (p == 2*i) System.out.printf("%" + spaces +"s",out);
                            }
                    }
                    
                    for (int t = (int)middle ; t > 0 ; t--){
                        System.out.printf("\n");
                        out = "";
                        spaces = N+t-1;
                        for (int p = 0; p < 2*t-1; p++) {
                            out += S;
                            if  (p == 2*t-2) System.out.printf("%" + spaces +"s",out);
                        }
                    }
                    break;

                case "trapecious":
                    for (int i = 1 ; i < N+1 ; i++) {
                        System.out.printf("\n");
                        spaces = 2*N+i-2;
                        out = "";
                        for (int p = 0; p < 2*i+1; p++) {
                            out += S;
                            if  (p == 2*i) System.out.printf("%" + spaces +"s",out);
                        }
                    }
                    break;
                default: 
                    System.out.printf("Wrong selection!");
           }
        }
}

