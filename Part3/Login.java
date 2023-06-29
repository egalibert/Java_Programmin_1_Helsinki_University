package Java_Programming.Java_Programmin_1_Helsinki_University.Part3;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = "sunshine";
        String password1 = "haskell";
        String username = "alex";
        String username1 = "emma";

        System.out.println("Enter username:");
        String user = scanner.nextLine();
        System.out.println("Enter password:");
        String pass = scanner.nextLine();

        if (user.equals(username) && (pass.equals(password))) {
            System.out.println("You have logged in successfully!");
        } else if (user.equals(username1) && (pass.equals(password1))) {
            System.out.println("You have logged in successfully!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}

