package Java_Programming.Java_Programmin_1_Helsinki_University.Part2;

import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.valueOf(scanner.nextLine());
        int num1 = Integer.valueOf(scanner.nextLine());
        if (num > num1) {
            System.out.println( num + " is greater than " + num1);
        } else if (num == num1) {
            System.out.println( num + " is equal to " + num1);
        } else {
            System.out.println( num + " is smaller than " + num1);
        }

    }
}
