import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        ArrayList<Books> books = new ArrayList<>();
        // implement here the program that allows the user to enter 
        // book information and to examine them
        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int page = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication Year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            books.add(new Books(title, page, year));
        }
        System.out.println("What information will be printed?");
        String input = scanner.nextLine();
        if(input.equals("everything")) {
            for (Books book: books) {
                System.out.println(book);
            }
            
        } else if (input.equals("name")) {
            for (Books book: books) {
                System.out.println(book.getTitle());
            }
        }

    }
}
