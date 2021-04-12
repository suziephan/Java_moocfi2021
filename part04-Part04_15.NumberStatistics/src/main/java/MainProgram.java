
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        //System.out.println("Count: " + statistics.getCount());
        //System.out.println("Sum: " + statistics.sum());
        //System.out.println("Average: " + statistics.average());
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number: ");
 
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1) {
                break;
            }
            statistics.addNumber(input);
            
            if(input %2 ==0) {
                even.addNumber(input);
            } else {
                odd.addNumber(input);
            }
        }
        System.out.println(statistics.average());
        System.out.println("Sum: "+ statistics.sum());
        System.out.println("Sum of even number: "+ even.sum());
        System.out.println("sum of odd number: "+ odd.sum());
    }
}
