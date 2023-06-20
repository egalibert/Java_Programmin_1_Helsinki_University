package Java_Programming.Java_Programmin_1_Helsinki_University.Part2;

import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Shall we carry on?");
            String answer = scanner.nextLine();
            if (answer.equals("no")) {
                break;
            }
        }

    }
}
