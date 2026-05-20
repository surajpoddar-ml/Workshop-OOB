package week8;

import java.io.FileWriter;

import java.io.IOException;

import java.io.BufferedWriter;
import java.util.Scanner;

public class number2 {

	public static void main(String[] args) {
		
		try {
		
			Scanner scanner = new Scanner(System.in);
			
		BufferedWriter  br = new BufferedWriter(new FileWriter ("files/CSVStudentFile.csv",true ));
		
		System.out.println("Enter the number of students");
		int num = scanner.nextInt();
		
		String firstName = null;
		String lastName= null;
		String address= null;
		String contactNumber = null;
		String semester = null;
		
		for (int i=1;i<=num;i++) {
			
			System.out.println("Enter the First Name of the Student:");
			firstName = scanner.nextLine();
			
			System.out.println("Enter the Last Name of the Student:");
			 lastName = scanner.nextLine();
			
			System.out.println("Enter the Address of the student:");
			 address = scanner.nextLine();
			
			System.out.println("Enter the Contact Number of the Student:");
			 contactNumber = scanner.nextLine();
			
			System.out.println("Enter the semester of the Student");
			 semester = scanner.nextLine();
			
		}
		
		Student student = new Student(firstName, lastName, address, contactNumber, semester);
		
		br.write(student.toCSV() + "\n");
		
		student.toCSV();
		
		br.close();
		scanner.close();
		
		System.out.println("The student data have been saved successfully in students.csv");

		}
		
		
		catch (IOException e) {
			System.out.println("There has been an error");
			e.printStackTrace();
			
		}
	}
}

class Student{
	
	String firstName;
	String lastName;
	String address;
	String contactNumber;
	String semester;
	
	public Student(String firstName, String lastName, String address, String contactNumber,String semester) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.contactNumber = contactNumber;
		this.semester = semester;
		
	}
	
	public String toCSV() {
		return firstName + ","+ lastName + ","+ address + ","+ contactNumber + ","+ semester;
	}
}



