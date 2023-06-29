package Java_Programming.Java_Programmin_1_Helsinki_University.Part3;

import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.println("Search for?");
        String str = scanner.nextLine();
        int i = 0;
        boolean ok = false;
        ok = list.contains(str);
        if (ok) {
            System.out.println(str + " was found!");
        } else {
            System.out.println(str + " was not found!");
        }
    }
}
