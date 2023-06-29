package Java_Programming.Java_Programmin_1_Helsinki_University.Part3;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        int i = 0;
        int total = 0;
        while (i < list.size()) {
            int value = list.get(i);
            total += value;
            i += 1;
        }
        double sum = total;
        System.out.println("Average: " + (sum / list.size()));
    }
}
