
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Archive> list = new ArrayList<>();
        
        while(true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
           
            Archive list1 = new Archive(id, name);
            if (id.isEmpty() && name.isEmpty()) {
                break;
            } else if (!list.contains(list1)) {
                list.add(list1);
            }
        }
        System.out.println("==Items==");
        for (int m =0 ; m <list.size(); m++) {
            System.out.println(list.get(m));
        }

    }
}
