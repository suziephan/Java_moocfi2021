
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
  
        System.out.println("Search for?");
        int number = Integer.valueOf(scanner.nextLine());
        int indexresult = 0;
        for ( int i =0; i <= list.size()-1; i++) {
            if (number == list.get(i)) {
                indexresult = i;
                System.out.println(number +" is at index "+ indexresult);
            }
        }
        
    }

    
}
