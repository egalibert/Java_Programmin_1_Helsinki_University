package Java_Programming.Java_Programmin_1_Helsinki_University.Part2;

import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                System.out.println("Number of numbers: " + total);
                System.out.println("Sum of the numbers: " + sum);
                break;
            } else {
                sum += num;
                total += 1;
            }
        }
    }
}