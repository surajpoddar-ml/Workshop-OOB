package Week2;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("To check the medical issue of student in exam");
        System.out.println("Press y  or n for verification");
        String result=sc.next();
        if (result.equalsIgnoreCase("y")) {
        	System.out.println("Not allowed to sit in exam");
        }
        else {
        	System.out.println("You can sit in exam");
        }
        sc.close();

	}

}
