package Java_Programming.Java_Programmin_1_Helsinki_University.Part3;

import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String name = "";
        while (true) {
            String info = scanner.nextLine();
            if (info.equals("")) {
                break;
            }
            String[] parts = info.split(",");
            int age = Integer.valueOf(parts[1]);
            if (age > oldest) {
                oldest = age;
                name = parts[0];
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}