package Week2;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a length :");
		double len=sc.nextDouble();
		System.out.println("Enter a breadth :");
		double Breadth=sc.nextDouble();
		if (len==Breadth) {
			System.out.println("Both length and breadth are equal so it is square");
		}
			else {
				System.out.println("It is not a square");
			}
		sc.close();
	}

}
