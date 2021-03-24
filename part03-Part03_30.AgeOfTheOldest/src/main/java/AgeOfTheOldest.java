
import java.util.Scanner;
import java.util.ArrayList;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ages = new ArrayList<>();
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] agesvalue = input.split(",");
            ages.add(Integer.valueOf(agesvalue[1]));
        }
        System.out.println("Age of the oldest: "+ findOldest(ages));
    }
    public static int findOldest (ArrayList<Integer> ages) {
        int max = 0;
        for (int i : ages) {
            if ( i > max) {
                max = i;
            }
        }
        return max;
   
        

    }
}
