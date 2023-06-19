package Java_Programming.Java_Programmin_1_Helsinki_University.Part1;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int value1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int value2 = Integer.valueOf(scanner.nextLine());

        double value3 = value1;
        double value4 = value2;

        System.out.println(value1 + " + " + value2 + " = " + (value1 + value2));
        System.out.println(value1 + " - " + value2 + " = " + (value1 - value2));
        System.out.println(value1 + " * " + value2 + " = " + (value1 * value2));
        System.out.println(value1 + " / " + value2 + " = " + ((value3 / value4)));

    }
}