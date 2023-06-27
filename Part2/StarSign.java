package Java_Programming.Java_Programmin_1_Helsinki_University.Part2;

public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        // first part of the exercise
       for (int i = 0; i < number; i++) {
			System.out.print("*");
		}
		System.out.println("");
    }

    public static void printSquare(int size) {
        // second part of the exercise
        int i = 0;
        int j = 0;
        while (i < size) {
            String res = "";
            j = 0;
            while (j < size) {
                res += "*";
                j += 1;
            }
            System.out.println(res);
            i += 1;
        }
    }

    public static void printRectangle(int width, int height) {
        int i = 0;
        int j = 0;
        while (i < height) {
            String res = "";
            j = 0;
            while (j < width) {
                res += "*";
                j += 1;
            }
            System.out.println(res);
            i += 1;
        }
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        for (int i = 1; i <= size; i++) {
			printStars(i);;
        }
    }
}
