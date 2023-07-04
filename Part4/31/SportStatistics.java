
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("File:");
		String file = scanner.nextLine();
		System.out.println("Team: ");
		String team = scanner.nextLine();
		int gameCount = 0;
		int wins = 0;
		int loss = 0;
		try (Scanner scan = new Scanner(Paths.get(file))) {

			// we read the file until all lines have been read
			while (scan.hasNextLine()) {
				// we read one line
				String row = scan.nextLine();
				String[] rowSplit = row.split(",");
				int score1 = Integer.valueOf(rowSplit[2]);
				int score2 = Integer.valueOf(rowSplit[3]);
				if (team.equals(rowSplit[0])) {
					gameCount++;
					if (score1 > score2) {
						wins++;
					} else {
						loss++;
					}
				} else if (team.equals(rowSplit[1])) {
					gameCount++;
					if (score2 > score1) {
						wins++;
					} else {
						loss++;
					}
				}
				// we print the line that we read
			}
			System.out.println("Games: " + gameCount);
			System.out.println("Wins: " + wins);
			System.out.println("Losses: " + loss);
		} catch (Exception e) {
			System.out.println("Reading the file " + file + " failed.");
		}
    }

}
