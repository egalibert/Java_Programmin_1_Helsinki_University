package Java_Programming.Java_Programmin_1_Helsinki_University.Part2;

import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int num = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        while (num > 0) {
            sum += num;
            num -= 1;
        }
        System.out.println("The sum is " + sum);

    }
}
