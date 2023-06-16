package Java_Programming.Java_Programmin_1_Helsinki_University.Part1;

import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a number:");
        int number = Integer.valueOf(scan.nextLine());

        if (number == 1984) {
            System.out.println("Orwell");
        }
    }
}
