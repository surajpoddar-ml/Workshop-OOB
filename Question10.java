package Workshop1;
import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		Scanner mc=new Scanner(System.in);
		System.out.println("Input a two number and perform various calculation");
		
		double a=mc.nextDouble();
		double b= mc.nextDouble();
		
		double add=a+b;
		System.out.println("The addition of two integer is  "+ add);
		double sub=a-b;
		System.out.println("The subtraction of two integer is  "+ sub);
		double mul=a*b;
		System.out.println("The multiplication of two integer is  "+ mul);
		double div=a+b;
		System.out.println("The division of two integer is  "+ div);
		mc.close();

	}

}
