
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int freq = 0;
        int sumNum = 0;
        while (true ) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number ==0) {
                break;
            }
            if (number != 0) {
                freq = freq+1;
                sumNum = sumNum + number;  
            }
            continue;
        }
        System.out.println("Average of the numbers: "+  ((double) sumNum/freq));

    }
}
