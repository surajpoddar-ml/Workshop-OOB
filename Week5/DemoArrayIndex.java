// Exception handling for ArrayIndexOutOfBoundsException
public class DemoArrayIndex {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        int[] age = {10, 20, 25, 24, 28, 27, 30, 31, 32};
        System.out.println(age[9]); // This will throw ArrayIndexOutOfBoundsException
    }
}
