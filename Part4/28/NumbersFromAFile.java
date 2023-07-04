
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int count = 0;
		try (Scanner scan = new Scanner(Paths.get(file))) {

			// we read the file until all lines have been read
			while (scan.hasNextLine()) {
				// we read one line
				String row = scan.nextLine();
				int num = Integer.valueOf(row);
				if (num >= lowerBound && num <= upperBound) {
					count++;
				}
				// we print the line that we read
			}
		System.out.println("Numbers: " + count);
		} catch (Exception e) {
			System.out.println("Reading the file " + file + " failed.");
		}
    }

}
