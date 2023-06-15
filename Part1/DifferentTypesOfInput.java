package Java_Programming.Java_Programmin_1_Helsinki_University.Part1;

import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String answer1 = scan.nextLine();
        System.out.println("Give an integer:");
        Integer answer2 = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        Double answer3 = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean answer4 = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + answer1);
        System.out.println("You gave the integer " + answer2);
        System.out.println("You gave the double " + answer3);
        System.out.println("You gave the boolean " + answer4);

    }
}
