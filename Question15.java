package Workshop1;
import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		Scanner mc=new Scanner(System.in);
		
		System.out.println("Enter two number and find sum, diff, product and quotient");
		
		double a=mc.nextDouble();
		double b=mc.nextDouble();
		
		double sum=a+b;
		System.out.println("The sum of two entered numbers " + sum);
		double diff=a-b;
		System.out.println("The difference of two entered numbers " + diff);
		double pro=a*b;
		System.out.println("The product of two entered numbers " + pro);
		double quo=a/b;
		System.out.println("The quotient of two entered numbers " + quo);
        mc.close();
	}

}
