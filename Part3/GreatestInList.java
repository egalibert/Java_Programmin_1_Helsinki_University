package Java_Programming.Java_Programmin_1_Helsinki_University.Part3;

import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

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

        // implement finding the greatest number in the list here
        int biggest = list.get(0);
        int i = 0;
        while (i < list.size()) {
            int value = list.get(i);
            if (biggest < value) {
                biggest = value;
            }
            i += 1;
        }
        System.out.println("Greatest number: " + biggest);
    }
}
