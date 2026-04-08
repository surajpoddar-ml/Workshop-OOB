// Exception handling for divide by zero
public class DemoExceptionHandling {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }
    }
}
