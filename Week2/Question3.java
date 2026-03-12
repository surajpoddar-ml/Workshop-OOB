package Week2;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the grade of subject : ");
		double marks =sc.nextDouble();
		if (marks<50 && marks>=40) {
			System.out.println("You got the grade C");
		}
		else if (marks>=50 && marks<60) {
			System.out.println("You got the grade C+");
		}
		else if (marks >=60 && marks<70) {
			System.out.println("You got the grade B");
		}
		else if (marks >=70 && marks<80) {
			System.out.println("You got the grade B+");
		}
		else if (marks >=80 && marks<90) {
			System.out.println("You got the grade A");
		}
		else if (marks>=90) {
			System.out.println("You got the grade A+");
		}
		else {
			System.out.println("You failed the exam");
		}
		sc.close();

	}

}
