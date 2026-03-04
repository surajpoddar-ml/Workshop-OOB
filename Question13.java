package Workshop1;
import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		Scanner mc=new Scanner(System.in);
		
		System.out.println("To find total price on the basis of quantity and price");
		double quantity=mc.nextDouble();
		double  Unitprice =mc.nextDouble();
		double Total=quantity*Unitprice;
		
		System.out.println("Total price of quantity is  "+Total);
		mc.close();
		

	}

}
