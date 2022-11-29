package DomJudge.Domjudge;
import java.util.*;

public class ex39 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in).useLocale(Locale.US);       
        char Z;
        String line = "", trash = "firstTime";
        float influence = 0, force, a = 0, b = 0, c = 0, d, e, f, distance;


        while(s.hasNextLine()){
            if (s.hasNext() == false) break;
            line = s.next();
            Z = line.charAt(0);
        
            // String numeros[] = line.split(":");

            if (Z == 't'){
                if (trash != "firstTime") {
                    System.out.printf("mortal at (%.2f,%.2f,%.2f)", a,b,c);
                    if (influence > 0){
                        System.out.printf(" is protected\n");

                    }else if (influence < 0){
                        System.out.printf(" is in danger\n");

                    }else{
                        System.out.printf(" is in no man's land\n");
                    }
                }
                trash = s.next();
                a = s.nextFloat();
                b = s.nextFloat();
                c = s.nextFloat();
                influence = 0;
                continue;
            }//Float.parseFloat(numeros[1])
            
            //Ruben helped me
            trash = s.next();
            trash = s.next();
            trash = s.next();
            if (Z == 's') trash = s.next();
            
            d = s.nextFloat();
            e = s.nextFloat();
            f = s.nextFloat();

            force = s.nextFloat();
            
            float x = d-a;
            float y = e-b;
            float z = f-c;

            distance = (float) Math.sqrt(x*x + y*y + z*z);

            // System.out.println(line);
            if (Z == 'j'){
                if (distance < force){
                    influence = influence + force; 
                }
            }else if (Z == 's'){
                if (distance < force){
                    influence = influence - force; 
                }
            }
        }
        System.out.printf("mortal at (%.2f,%.2f,%.2f)", a,b,c);
            if (influence > 0){
                System.out.printf(" is protected\n");

            }else if (influence < 0){
                System.out.printf(" is in danger\n");

            }else{
                System.out.printf(" is in no man's land\n");
            }
    }
}