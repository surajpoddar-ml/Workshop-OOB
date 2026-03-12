package Week2;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		System.out.println("To Compare the age of two peron");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the age of first person");
		double age1=sc.nextDouble();
		System.out.println("Enter the age of first person");
		double age2=sc.nextDouble();
		if (age1>age2) {
			System.out.println("First Person is a elder");
		}
		if (age1<age2) {
			System.out.println("Second Person is a elder");
		}
		else {
			System.out.println("Both are of same age");
		}	
		sc.close();

	}

}
