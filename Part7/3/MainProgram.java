import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        // int[] numbers = {6, 5, 8, 7, 11};
        // System.out.println("Smallest: " + MainProgram.smallest(numbers));
        // System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));
        // int[] numbers = {-1, 6, 9, 8, 12};
        // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
        int[] numbers = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));
    }


    public static int smallest(int[] array){
        int smallest = 100;
        for (int value : array) {
            if (value < smallest) {
                smallest = value;
            }
        }
        return smallest;
    } 

    public static int indexOfSmallest(int[] array){
        int smallest = 100;
        int index = 0;
        int i = 0;
        while (i < array.length) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
            i++;
        }
        return (index);
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = 100;
        int index = 0;
        while(startIndex < table.length) {
            if (table[startIndex] < smallest) {
                smallest = table[startIndex];
                index = startIndex;
            }
            startIndex++;
        }
        return (index);
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = 0;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			swap(array, i ,indexOfSmallestFrom(array, i));
	    }
    }
}
