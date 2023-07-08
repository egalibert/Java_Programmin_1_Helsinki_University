import java.util.Scanner;

public class LiquidContainers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int first = 0;
		int second = 0;

		while (true) {
			System.out.print("> ");
			System.out.println("First: " + first + "/100");
			System.out.println("Second: " + second + "/100");


			String input = scan.nextLine();
			if (input.equals("quit")) {
				break;
			}
			String[] parts = input.split(" ");
			String command = parts[0];
			int amount = Integer.valueOf(parts[1]);
			if (command.equals("add")) {
				if (amount > 0) {
					first = first + amount > 100 ? 100 : first + amount;
				}
			} else if (command.equals("move")) {
				if (amount > 0) {
					if (amount >= first) {
						second = second + first > 100 ? 100 : second + first;
						first = 0;
					} else {
						second = second + amount > 100 ? 100 : second + amount;
						first -= amount;
					}
				}
			} else if (command.equals("remove")) {
				second = second - amount < 0 ? 0 : second - amount;
			}

		}
	}

}