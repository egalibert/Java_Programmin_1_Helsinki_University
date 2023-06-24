package Java_Programming.Java_Programmin_1_Helsinki_University.Part2;

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }

    public static void printUntilNumber(int number) {
        int i = 1;
        while (i <= number) {
            System.out.println(i);
            i += 1;
        }
    }

}
