package Java_Programming.Java_Programmin_1_Helsinki_University.Part1;

import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here. 
        System.out.println("How old are you?");
        int age = Integer.valueOf(scan.nextLine());
        if (age > 0 && age < 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
