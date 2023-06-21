package Java_Programming.Java_Programmin_1_Helsinki_University.Part2;

import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 0;
        int num = Integer.valueOf(scanner.nextLine());
        while (start <= num) {
            System.out.println(start);
            start += 1;
        }

    }
}
