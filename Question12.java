package Workshop1;
import java.util.Scanner;


public class Question12 {

	public static void main(String[] args) {
		Scanner mc=new Scanner(System.in);
		 
		System.out.println("Enter a radius of a circle");
	    double radius = mc.nextDouble();
	    double area = Math.PI *radius *radius;
	    System.out.println("The area of a circle is  "+area);
		mc.close();

	}

}
