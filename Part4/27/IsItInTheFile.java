
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        boolean found = false;
		try (Scanner scan = new Scanner(Paths.get(file))) {

			// we read the file until all lines have been read
			while (scan.hasNextLine()) {
				// we read one line
				String row = scan.nextLine();
				if (row.equals(searchedFor)) {
					System.out.println("Found!");
					found = true;
					break;
				}
				// we print the line that we read
			}
			if (!found) {
				System.out.println("Not found.");
			}
		} catch (Exception e) {
			System.out.println("Reading the file " + file + " failed.");
		}
    }
}
