
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int sum = 0;
        int count =0;
        int len = 0;
        while (true ) {
            String input = scanner.nextLine();
            if( input.equals("")) {
                break;
            }
            String[] array = input.split(",");
            if (len < array[0].length()) {
                len = array[0].length();
                name = array[0];
                
            }
            sum +=Integer.valueOf(array[1]);
            count++;
        }
        System.out.println("Longest name: "+ name);
        System.out.println("Average of the birth years: "+ (sum*1.0/count));


    }
}
