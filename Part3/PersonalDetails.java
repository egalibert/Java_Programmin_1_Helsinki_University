package Java_Programming.Java_Programmin_1_Helsinki_University.Part3;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        int count = 0;
        String name = "";
        while (true) {
            String info = scanner.nextLine();
            if (info.equals("")) {
                break;
            }
            String[] parts = info.split(",");
            count += 1;
            int year = Integer.valueOf(parts[1]);
            total += year;
            if (parts[0].length() > name.length()) {
                name = parts[0];
            }
        }
        System.out.println("Longest name: " + name);
        double average = total / count;
        System.out.println("Average of the birth years: " + average);
    }
}