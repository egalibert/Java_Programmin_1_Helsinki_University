import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class UserInterface {
	private Scanner scan;
	private String file;
	private Cookbook book;

	public UserInterface() {
		this.scan = new Scanner(System.in);
		this.book = new Cookbook();
		this.file = "";
	}

	public void readFile() {
		System.out.print("File to read: ");
		this.file = scan.nextLine();
		try (Scanner scanner = new Scanner(Paths.get(this.file))) {
			while (scanner.hasNextLine()) {
				ArrayList<String> ingredientsList = new ArrayList<>();
				String name = scanner.nextLine();
				int time = Integer.valueOf(scanner.nextLine());
				String ingredient = scanner.nextLine();
				while (scanner.hasNextLine()) {
					if (ingredient.isEmpty()) {
						break;
					}
					ingredientsList.add(ingredient);
					ingredient = scanner.nextLine();
				}
				Recipe recipe = new Recipe(name, time, ingredientsList);
				this.book.addRecipe(recipe);
			}
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public void getCommand() {
		while (true) {
			System.out.print("\nEnter command: ");
			String command = this.scan.nextLine();
			if (command.equals("stop")) {
				break;
			}
			
			if (command.equals("list")) {
				this.book.listAllRecipes();
			} else if (command.equals("find name")) {
				System.out.print("Searched word: ");
				String name = this.scan.nextLine();
				this.book.findByName(name);
			} else if (command.equals("find cooking time")) {
				System.out.print("Max cooking time: ");
				int maxTime = Integer.valueOf(this.scan.nextLine());
				this.book.findByTime(maxTime);
			} else if (command.equals("find ingredient")) {
				System.out.print("Ingredient: ");
				String ingredient = this.scan.nextLine();
				this.book.findByIngredient(ingredient);
			}
		}

	}

	public void run() {
		readFile();
		System.out.println("\nCommands:");
		System.out.println("list - lists the recipes");
		System.out.println("stop - stops the program");
		System.out.println("find name - searches recipes by name");
		System.out.println("find cooking time - searches recipes by cooking time");
		System.out.println("find ingredient - searches recipes by ingredient");
		getCommand();
	}
}
