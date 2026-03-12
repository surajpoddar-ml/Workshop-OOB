package Week2;
import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("To find even and odd numbers");
		 float N=sc.nextFloat();
		 if (N%2==0) {
			 System.out.println("IT IS EVEN NUMBER"); 
		 }
		 else {
			 System.out.println("IT IS ODD NUMBER");
		 }
           sc.close();
	}

}
