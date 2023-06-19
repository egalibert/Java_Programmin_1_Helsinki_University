package Java_Programming.Java_Programmin_1_Helsinki_University.Part1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Give a year:");
		int year = Integer.valueOf(scan.next());
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("The year is a leap year.");
				} else {
					System.out.println("The year is not a leap year.");
				}
			} else {
				System.out.println("The year is a leap year.");
			}
		} else {
			System.out.println("The year is not a leap year.");
		}

	}
}