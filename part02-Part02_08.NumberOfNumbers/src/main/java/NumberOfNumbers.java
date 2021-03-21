
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countnumber = 0;
        while (true ) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number ==0) {
                break;
            } 
            countnumber = countnumber + 1;
            continue;
                    
        }
        System.out.println("Number of numbers: " + countnumber);

    }
}
