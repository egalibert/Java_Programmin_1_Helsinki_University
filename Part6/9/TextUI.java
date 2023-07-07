import java.util.ArrayList;
import java.util.Scanner;

public class TextUI {
	private SimpleDictionary dictionary;
	private Scanner scanner;

	public TextUI(Scanner scanner, SimpleDictionary dictionary) {
		this.scanner = scanner;
		this.dictionary = dictionary;
	}

	public void addCommand() {
		System.out.print("Word: ");
		String word = this.scanner.nextLine();
		System.out.print("Translation: ");
		String translation = this.scanner.nextLine();
		this.dictionary.add(word, translation);
	}

	public void searchTranslation() {
		System.out.print("To be translated: ");
		String word = this.scanner.nextLine();
		String translation = this.dictionary.translate(word);
		if (translation == null) {
			System.out.println("Word " + word + " was not found");
		} else {
			System.out.println("Transaltion: " + translation);
		}
	}

	public void start() {
		while (true) {
			System.out.print("Command: ");
			String input = this.scanner.nextLine();
			if (input.equals("end")) {
				break;
			}
			if (input.equals("add")) {
				this.addCommand();
			} else if (input.equals("search")) {
				this.searchTranslation();
			} else {
				System.out.println("Unknown command");
			}
		}
		System.out.println("Bye bye!");
	}
}
