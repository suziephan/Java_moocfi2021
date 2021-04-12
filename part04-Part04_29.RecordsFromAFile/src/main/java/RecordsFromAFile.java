
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();
        
        //read the file
  
        try (Scanner scan = new Scanner(Paths.get(file));) {
            while(scan.hasNextLine()) {
                String row = scan.nextLine();
                //split row input

                String[] list = row.split(",");
                String name = list[0];
                int age = Integer.valueOf(list[1]);
                if (age ==1) {
                    System.out.println(name + ", " + "age: " +age+ " year");
                } else {
                    System.out.println(name + ", " + "age: " +age+ " years");
                }
            }
        } catch (Exception e) {
            System.out.println("errors");
        }
        

    }
}
