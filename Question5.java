package Workshop1;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a length and breadth of rectangle");
		int l=sc.nextInt();
		int b=sc.nextInt();
		double perimeter=2*(l+b);
		System.out.println("The perimeter of rectangle is" + perimeter);
		sc.close();
	}

}
