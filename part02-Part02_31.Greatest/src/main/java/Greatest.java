
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int greatest = 0;
        int greater = 0;
        if ( number1 > number2) {
            greater = number1;
        } else {
            greater = number2;
        }
        
        if ( greater > number3) {
            greatest = greater; 
        } else {
            greatest = number3;
        }

        return greatest;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
