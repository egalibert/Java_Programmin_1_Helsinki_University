package Java_Programming.Java_Programmin_1_Helsinki_University.Part2;

public class Division {

    public static void main(String[] args) {
        
        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"

        division(3, 5);
    }

    // implement the method here
    public static void division(int numerator, int denominator) {
        float num1 = numerator;
        float num2 = denominator;

        float result = num1 / num2;
        System.out.println(result);

    }
}
