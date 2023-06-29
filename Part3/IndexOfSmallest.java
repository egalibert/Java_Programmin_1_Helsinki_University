package Java_Programming.Java_Programmin_1_Helsinki_University.Part3;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            list.add(input);
        }

        int smallest = 100000;
        int i = 0;
        while (i < list.size()) {
            int value = list.get(i);
            if (value < smallest) {
                smallest = value;
            }
            i += 1;
        }
        System.out.println("Smallest number: " + smallest);
        i = 0;
        while (i < list.size()) {
            int value = 0;
            value = list.get(i);
            if (value == smallest) {
                System.out.println("Found at index: " + i);
            }
            i += 1;
        }
    }
}
