package Week2;
import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		long total=1;
		for(int i=1;i<=a;i++) {
		total *=i;	
		}
		System.out.println(total);	
		sc.close();

	}

}
