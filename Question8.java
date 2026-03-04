package Workshop1;
import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a radius and height of cylinder");
		double rad=sc.nextDouble();
		double height=sc.nextDouble();
		double volume = Math.PI *rad*rad*height;
		System.out.println("The volume of a cylinder is  "+ volume);
		sc.close();
		

	}

}
