
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int oldest = 0;
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("")) {
                break;
            }
            String[] names = input.split(",");

            if (oldest < Integer.valueOf(names[1])) {
                oldest = Integer.valueOf(names[1]);
                name = names[0];
            }
            
        }
        System.out.println("Name of the oldest: "+ name);


    }
}
