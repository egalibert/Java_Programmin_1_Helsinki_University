package Java_Programming.Java_Programmin_1_Helsinki_University.Part1;

import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int value1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int value2 = Integer.valueOf(scanner.nextLine());

        System.out.println("The sum of the numbers is " + (value1 + value2));

    }
}
