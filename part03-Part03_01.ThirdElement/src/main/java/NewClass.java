/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NT
 */
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int values = 0;
        int sum = 0;
        
        while (true) {
            System.out.println("Provide a value, a negative value ends the program");
            int value = Integer.valueOf(scanner.nextLine());
            if (value < 0) {
                break;
            }
            values = values + 1;
            sum = sum + value;
        }
  
        System.out.println("-- loop existed");
        System.out.println("--values: "+ values +", sum: " +sum);
        
        if (sum ==0 && values ==0 ) {
            System.out.println("no avg");
        } else {
            System.out.println("Average of values: "+ (1.0*sum/values));
        }
        
        
    }
}

        
        
        


