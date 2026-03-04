package Workshop1;
import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the temp in celcius");
		double cel=sc.nextDouble();
		double fahren= (cel * 9.0 / 5.0) + 32.0;
		System.out.println("The temperature in fahrenheit  " + fahren);
		sc.close();

	}

}
