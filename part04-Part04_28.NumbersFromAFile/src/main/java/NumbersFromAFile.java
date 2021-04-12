
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> number =  new ArrayList<>();
        
        int count =0;
        //ask for file name to read
        System.out.print("File? ");
        String file = scanner.nextLine();
        
        //read file name add add each row into an array list
        try (Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                number.add(Integer.valueOf(scan.nextLine())); 
            }
        } catch (Exception e ) {
            System.out.println("cant find file!");
        }
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        for (int i:number ) {
            if (i >= lowerBound && i<=upperBound) {
                count++;
            }
            
        }
        System.out.println("Numbers: " +count);

    }

}   
