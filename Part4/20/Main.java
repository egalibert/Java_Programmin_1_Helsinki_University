import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
  
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Books> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Title:");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages:");
            String pages = (scanner.nextLine());
            String pubYear = scanner.nextLine();
            books.add(new Books(title, pages, pubYear));
        }
        System.out.println("");
        System.out.println("What information will be printed");
        String choosing = scanner.nextLine();
        for (Books book : books) {
            if (choosing.equals("everything")) {
                System.out.println(book);
            } else if (choosing.equals("name")) {
				System.out.println(book.getName());
			} else if (choosing.equals("pages")) {
				System.out.println(book.getPages());
			} else if (choosing.equals("publication year")) {
				System.out.println(book.getYear());
			}
        }
    }
}
