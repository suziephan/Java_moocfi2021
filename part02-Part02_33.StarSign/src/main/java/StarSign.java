
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
        System.out.println("This is print start two");
        printStarsTwo(3);
    }

    public static void printStars(int number) {
        // first part of the exercise
        int start = 1;
        String star = "";
        while (start <= number) {
            star  += "*";
            start ++;
        }
        System.out.println(star);
    }
 

    public static void printSquare(int size) {
        // second part of the exercise
        int row = 1;
        while (row <= size) {
            printStars(size);
            row++;
        }
        
    }

    public static void printRectangle(int width, int height) {
        
        // third part of the exercise
        int row = 1;
        while ( row <= height ) {
            printStars(width);
            row++;
        }
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        int element = 1;
        while (element <= size) {
            printStars (element);
            element++;
        }
    }
    public static void printStarsTwo(int number) {
        // first part of the exercise
        int countPrinted = 0;
        while (countPrinted < number) {
            System.out.print("*");
            countPrinted = countPrinted + 1;
        }
        //System.out.println("");
    }
}
