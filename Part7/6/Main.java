
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Results results = new Results();
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        while (true) {
            System.out.println("Enter point totals, -1 stops:");
            int value = Integer.valueOf((scanner.nextLine()));
            if (value == -1) {
                break;
            } else if (value >= 0 && value <= 100) {
				Points newPoints = new Points(value);
				results.addPoints(newPoints);
			}
		}
	    results.printResults();
    }
}
