package Workshop1;
import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter a length of square of one side");
		double l=sc.nextDouble();
		double area=l*l;
		System.out.println("The area of a square is  "+ area);
		sc.close();
	}

}
