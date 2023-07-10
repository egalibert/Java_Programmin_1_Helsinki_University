import java.util.ArrayList;
import java.util.Scanner;


public class UserInterface {
	private BirdDatabase birdBook;
	
	public UserInterface() {
		this.birdBook = new BirdDatabase();
	}

	public void executeCommand(Scanner scan, String command) {
		if (command.equals("Add")) {
			System.out.print("Name: ");
			String name = scan.nextLine();
			System.out.print("Name in Latin: ");
			String latin = scan.nextLine();
			Bird bird = new Bird(name, latin);
			this.birdBook.addBird(bird);
		} else if (command.equals("Observation")) {
			System.out.print("Bird? ");
			String birdName = scan.nextLine();
			this.birdBook.checkDatabase(birdName);
		} else if (command.equals("All")) {
			this.birdBook.printAllBirds();
		} else if (command.equals("One")) {
			System.out.print("Bird? ");
			String birdName = scan.nextLine();
			this.birdBook.printOne(birdName);
		}
	}

	public void run(Scanner scan) {
		while (true) {
			System.out.print("? ");
			String command = scan.nextLine();
			if (command.equals("Quit")) {
				break;
			}
			executeCommand(scan, command);
		}
	}
}