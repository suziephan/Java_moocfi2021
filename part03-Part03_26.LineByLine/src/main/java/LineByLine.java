
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true ) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            for ( String i : input.split(" ")) {
                System.out.println(i);
            }
        }
    }
}
//"programming is fun\nit's true\n\n"