import java.util.*;

class ex2 {
    public static void main( String [] args){
        Scanner input = new Scanner( System.in ).useLocale( Locale.US); 
        while( input.hasNext() ){
            int a = input.nextInt();
            int b = input.nextInt();
            
            System.out.println( a+b );
        }
    }
}