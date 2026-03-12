package Week2;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        
        int total = 0;
        int i = 1;
        
        while(i <= n) {
            total += (2 * i);
            i++;
        }
        
        System.out.println("Sum = " + total);
        scanner.close();
    }
}