package Workshop1;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a a different sides of triangle");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		double S=(a+b+c)/2.0;
		double area = Math.sqrt(S * (S - a) * (S - b) * (S - c));
		System.out.println(area);
		sc.close();
	}

}
