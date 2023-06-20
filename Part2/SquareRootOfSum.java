package Java_Programming.Java_Programmin_1_Helsinki_University.Part2;

import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.valueOf(scanner.nextLine());
        int num2 = Integer.valueOf(scanner.nextLine());

        double SquareRootOfSum = Math.sqrt(num + num2);

        Double newData = SquareRootOfSum;
        int value = newData.intValue();

        System.out.println(value);

    }
}
