package Java_Programming.Java_Programmin_1_Helsinki_University.Part3;

import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        System.out.println(sum(numbers));

        numbers.add(5);
        numbers.add(1);
        System.out.println(sum(numbers));
    }

    public static int sum(ArrayList<Integer> numbers) {
        int result = 0;
        
        for (int i = 0; i < numbers.size(); i++) {
            int value = numbers.get(i);
            result += value;
        }
        return result;
    }

}