package Java_Programming.Java_Programmin_1_Helsinki_University.Part1;

import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        int value = Integer.valueOf(scanner.nextLine());
        value = (value * 86400);
        System.out.println(value);

    }
}
