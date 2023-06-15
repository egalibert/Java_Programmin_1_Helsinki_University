package Java_Programming.Java_Programmin_1_Helsinki_University.Part1;

import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int value1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int value2 = Integer.valueOf(scanner.nextLine());

        double average = (value1 + value2) / 2.0;

        System.out.println("The average is " + (average));

    }
}