
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());
        int res = first + second ;
        if (res >=0 ){
            double number = Math.sqrt(res);
            System.out.println(number);
    
        }
    }   
}
