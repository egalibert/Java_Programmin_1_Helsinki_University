package Java_Programming.Java_Programmin_1_Helsinki_University.Part1;

import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give a number:");
        String answer1 = scanner.nextLine();
        int value = Integer.valueOf(answer1);
        System.out.println("You gave the number " + value);

    }
}
