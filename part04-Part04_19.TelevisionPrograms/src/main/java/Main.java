import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Name: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            System.out.println("Duration: ");
            int time = Integer.valueOf(scanner.nextLine());
            programs.add ( new TelevisionProgram (input, time));
            
        }
        System.out.println("Program's maximum duration? ");
        int limit = Integer.valueOf(scanner.nextLine());
        for (TelevisionProgram pro : programs) {
            if (pro.getDuration() <= limit) {
                System.out.println(pro.getName()+", "+ pro.getDuration() + " minutes");
            }
        }
    }
}
