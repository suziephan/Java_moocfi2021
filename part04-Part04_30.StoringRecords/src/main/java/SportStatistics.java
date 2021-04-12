
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Implement the ability to output the number of games played by any given team. 
        //We're using the above-mentioned data.csv file.
        System.out.println("File:");
        String input = scan.nextLine();
        System.out.println("Team");
        String team = scan.nextLine();
        int match =0;
        int win =0; 
        int lose =0;
        ArrayList <String> games = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get(input))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                String[] parts = row.split(",");
                String home = parts[0];
                String visit = parts[1];
                int homepoint = Integer.valueOf(parts[2]);
                int visitpoint = Integer.valueOf(parts[3]);
                if (home.equals(team) || visit.equals(team) ) {
                    match++;
                }
                
                if (home.equals(team)) {
                    if (homepoint > visitpoint) {
                        win++;       
                    } else {
                        lose++;   
                    }
                }
                if (visit.equals(team)) {                    
                    if (homepoint > visitpoint) {
                        lose++;
                    } else {
                        win++;                    
                    }
                }
            }
            System.out.println("Games: "+ match);
            System.out.println("Wins: "+ win);
            System.out.println("Losses: "+ lose);
        } catch (Exception e) {
            System.out.println("error babe");
        }
        

    }

}
