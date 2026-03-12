package Week2;
import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("To find Grades and Percentage of five subjects");
		System.out.println("Enter the marks of a physics");
		double physics=sc.nextDouble();
		System.out.println("Enter the marks of a Chemistry");
		double Chemistry=sc.nextDouble();
		System.out.println("Enter the marks of a Biology");
		double Biology=sc.nextDouble();
		System.out.println("Enter the marks of a math");
		double math=sc.nextDouble();
		System.out.println("Enter the marks of a computer");
		double computer=sc.nextDouble();
		
		double Total=physics +Chemistry+Biology+math+computer;
		double percentage=Total/500.0;
		double real=percentage *100.0;
		System.out.println("YOU GOT PERCENTAGE  "+real);
		if (real>=90) {
			System.out.println("YOU GOT GRADE A AND 90% ABOVE");
		}
		if (real>=80 && real<90) {
			System.out.println("YOU GOT GRADE B  AND 80% ABOVE");
		}
		if (real>=70 && real<80) {
			System.out.println("YOU GOT GRADE C AND 70% ABOVE");
		}
		if (real>=60 && real<70) {
			System.out.println("YOU GOT GRADE D AND 60% ABOVE");
		}
		if (real>=40 && real<60) {
			System.out.println("YOU GOT GRADE E AND 40% ABOVE");
		}
		else {
			System.out.println("YOU HAVE FAILED THE EXAM AND GOT GRADE F");
		}
		sc.close();
		
	}

}

