package Workshop1;
import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		Scanner mc=new Scanner(System.in);
		
		System.out.println("Enter a principal,Time and Rate of Interest");
		double Principal=mc.nextDouble();
		double Time=mc.nextDouble();
		double Rate=mc.nextDouble();
		double Interest =(Principal * Rate * Time)/100.0;
		System.out.println("The interest of entered principal is  "+ Interest);
		mc.close();
	}

}
