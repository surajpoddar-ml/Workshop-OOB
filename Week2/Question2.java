package Week2;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Multiplication of a table of :");
		int num=sc.nextInt();
		System.out.println("Multiplication of a table of :"+num);
		for (int i=1; i<=10;i++) {
			System.out.println(num + "*"+  i + "="+ (num * i));
		}
		sc.close();
	}

}
