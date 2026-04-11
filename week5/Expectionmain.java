package week5;

public class Expectionmain {
    public static void main(String[] args) {

        System.out.println("=== Exception 1: Division by Zero ===");
        System.out.println("Exception type: ArithmeticException");
        System.out.println("Handled using: try-catch\n");

        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        System.out.println("\n=== Exception 2: Array Index Out of Bounds ===");
        System.out.println("Exception type: ArrayIndexOutOfBoundsException");
        System.out.println("Handled using: throws keyword\n");

        try {
            printArrayElement();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void printArrayElement() throws ArrayIndexOutOfBoundsException {
        int[] age = {10, 20, 25, 24, 28, 27, 30, 31, 32};
        System.out.println(age[9]); 
    }
}