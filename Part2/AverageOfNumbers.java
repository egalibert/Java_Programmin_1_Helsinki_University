package Java_Programming.Java_Programmin_1_Helsinki_University.Part2;

import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        double amount = 0;
        double sum = 0;
        while (true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                sum = total / amount;
                System.out.println(total);
                System.out.println(amount);
                System.out.println(("Average of the numbers: " + sum));
            } else {
                total += num;
                amount += 1;
            }
        }
    }
}
