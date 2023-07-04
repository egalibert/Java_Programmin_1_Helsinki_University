
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Filename:");
		String file = scan.nextLine();

		ArrayList<Person> records = readRecordsFromFile(file);
		System.out.println("Persons: " + records.size());
		System.out.println("Persons:");
		for (Person person : records) {
			System.out.println(person);

		}
	}

	public static ArrayList<Person> readRecordsFromFile(String file) {
		ArrayList<Person> persons = new ArrayList<>();

		// Write here the code for reading from file
		// and printing the read records
		try (Scanner scan = new Scanner(Paths.get(file))) {

			// we read the file until all lines have been read
			while (scan.hasNextLine()) {
				// we read one line
				String row = scan.nextLine();
				String[] rowSplit = row.split(",");
				persons.add(new Person(rowSplit[0], Integer.valueOf(rowSplit[1])));
				// we print the line that we read
			}
		} catch (Exception e) {
			System.out.println("Reading the file " + file + " failed.");
		}
		return persons;

    }
}
