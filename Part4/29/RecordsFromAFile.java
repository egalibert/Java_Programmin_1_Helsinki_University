
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name of the file: ");
		String file = scanner.nextLine();
		try (Scanner scan = new Scanner(Paths.get(file))) {

			// we read the file until all lines have been read
			while (scan.hasNextLine()) {
				// we read one line
				String row = scan.nextLine();
				String[] rowSplit = row.split(",");
				int age = Integer.valueOf(rowSplit[1]);
				String name = rowSplit[0];
				if (age == 1) {
					System.out.println(name + ", age: " + age + " year");
				} else {
					System.out.println(name + ", age: " + age + " years");
				}
				// we print the line that we read
			}
		} catch (Exception e) {
			System.out.println("Reading the file " + file + " failed.");
		}

    }
}
