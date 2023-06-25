package Java_Programming.Java_Programmin_1_Helsinki_University.Part2;

import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(3, 6);

    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        while (beginning <= end) {
            if (beginning % 3 == 0) {
                System.out.println(beginning);
            }
            beginning += 1;
        }
    }

}
