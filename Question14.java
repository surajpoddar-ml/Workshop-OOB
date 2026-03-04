package Workshop1;
import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		Scanner mc=new Scanner(System.in);
		
		System.out.println("Enter US dollar to convert in rupees");
		double US =mc.nextDouble();
		double rupee =US*150;
		System.out.println("The US dollar of entered amount in rupee is "+rupee);
		mc.close();
	}

}
