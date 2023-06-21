package Java_Programming.Java_Programmin_1_Helsinki_University.Part2;

import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double count = 0;
        double total = 0;
        double sum = 0;
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0){
                if (count == 0) {
                    System.out.println("Cannot calculate the average");
                    break;
                }
                sum = total / count;

                System.out.println(sum);
                break;
            }

            if (num > 0) {
                total += num;
                count += 1;
            }
        }
    }
}
