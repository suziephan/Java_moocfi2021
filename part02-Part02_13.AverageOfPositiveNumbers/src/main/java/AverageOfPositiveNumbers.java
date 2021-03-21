
import java.util.Scanner;

public class AverageOfPositiveNumbers {

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
            if (number > 0) {
                freq = freq+1;
                sumNum = sumNum + number;  
            }
            if (number >0) {
                sumNum = sumNum;
                
            }
            
            continue;
        }
        if(sumNum !=0 ){
            System.out.println("Average of the numbers: "+  ((double) sumNum/freq));
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
