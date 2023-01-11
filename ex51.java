package DomJudge.Domjudge;
import java.util.*;

public class ex51 {
    
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);

        String fullName, name, lastName, phone, email, birth, ageString = "";
        int age; 
        int count = 0;
        String [] agenda = new String [200], myAgenda;

        while (s.hasNext()){
            name = s.nextLine().trim();
            lastName = s.nextLine().trim();
            phone = s.nextLine().trim();
            email = s.nextLine().trim();
            birth = s.nextLine().trim().replace("  ", "-");

            //GET YEAR; MONTH; DAY
            int y = Integer.parseInt(birth.substring(0, 4));
            int m = Integer.parseInt(birth.substring(6, 7));
            int d = Integer.parseInt(birth.substring(9, 10));

            if (m > 2){
                age = 2019 - y;
            }else if (m == 2 && d > 20){
                age = 2019 - y;
            }else{
                age = 2020 - y;
            }

            fullName = name + ", " + lastName;
            
            String ans = String.format("%-40s  %-30s %-12s %s  age    %s", fullName, email, phone, birth, age); 
            agenda[count] = ans;
            count++;
            
        }
        myAgenda = new String [count];
        for (int i = 0; i < count; i++){
            myAgenda[i] = agenda[i];
        }
        Arrays.sort(myAgenda);
        for (int i = count-1; i >= 0; i--){
            System.out.println(myAgenda[i]);
        }
    }

}
