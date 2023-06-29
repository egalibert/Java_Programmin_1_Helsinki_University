package Java_Programming.Java_Programmin_1_Helsinki_University.Part3;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // toteuta listan lukujen summan laskeminen tänne
        int i = 0;
        int total = 0;
        while (i < list.size()) {
            int value = list.get(i);
            total += value;
            i += 1;
        }
        System.out.println("Sum: " + total);
    }
}
