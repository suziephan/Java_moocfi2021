
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange (2,10);

    }
    public static void divisibleByThreeInRange (int number1, int number2) {
        int i = number1;
        while (i<= number2 ) {
            if(i %3 ==0 ) {
                System.out.println(i);
            }
            i++;
        }
    }

}
