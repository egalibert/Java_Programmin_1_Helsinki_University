import java.util.Scanner;

public class UserInterface {
	private Scanner scanner;
	private TodoList list;

	public UserInterface(TodoList list, Scanner scanner) {
		this.scanner = scanner;
		this.list = list;
	}

	public void add_to_list() {
		System.out.println("To add:");
		String add = scanner.nextLine();
		this.list.add(add);
	}

	public void remove_from_list() {
		System.out.println("which one is rmeoveed?");
		int remove = Integer.valueOf(scanner.nextLine());
		if (remove <= this.list.size()) {
			this.list.remove(remove);
		}
	}

	public void start() {
		while (true) {
			System.out.println("Command:");
			String command = scanner.nextLine();
			if (command.equals("stop")) {
				break;
			} else if (command.equals("add")) {
				add_to_list();
			} else if (command.equals("list")) {
				this.list.print();
			} else if (command.equals("remove")) {
				remove_from_list();
			}
		}
	}
}
