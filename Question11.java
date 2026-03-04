package Workshop1;
import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		Scanner mc=new Scanner(System.in);
		System.out.println("Enter a distance in miles to conver in kilometers");
		
		double miles=mc.nextDouble();
		double kilometers=miles*1.60934;
		System.out.println("The distance in kilometers is  "+ kilometers);
		mc.close();

	}

}
