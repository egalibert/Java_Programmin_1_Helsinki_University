package Java_Programming.Java_Programmin_1_Helsinki_University.Part2;

public class FromParameterToOne {

	public static void main(String[] args) {
		printFromNumberToOne(5);
	}

	public static void printFromNumberToOne(int number) {
		for (int i = number; i > 0; i--) {
			System.out.println(i);
		}
	}
}