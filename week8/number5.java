package week8;

import java.io.FileWriter;

import java.io.IOException;

import java.util.Scanner;

public class number5 {

	public static void main(String[] args) {
		
		try {
		
			Scanner scanner = new Scanner(System.in);
			
		FileWriter  writer = new FileWriter ("files/CSVStudentFilenum5.csv",true );
		
		System.out.println("Enter the number of students");
		int num = scanner.nextInt();
		
		
		for (int i=1;i<=num;i++) {
			
			System.out.println("Enter the First Name of the Student:");
			String firstName = scanner.nextLine();
			
			System.out.println("Enter the Last Name of the Student:");
			String lastName = scanner.nextLine();
			
			System.out.println("Enter the Address of the student:");
			String address = scanner.nextLine();
			
			System.out.println("Enter the Contact Number of the Student:");
			String contactNumber = scanner.nextLine();
			
			System.out.println("Enter the semester of the Student");
			String semester = scanner.nextLine();
			
			
			Student student = new Student(firstName, lastName, address, contactNumber, semester);

			writer.write(student.toCSV() + "\n");
			
			student.toCSV();
		}
		
				
		
		
		writer.close();
		scanner.close();
		
		System.out.println("The student data have been saved successfully in students.csv");

		}
		
		
		catch (IOException e) {
			System.out.println("There has been an error");
			e.printStackTrace();
			
		}
	}
}

class Student2{
	
	String firstName;
	String lastName;
	String address;
	String contactNumber;
	String semester;
	
	public Student2(String firstName, String lastName, String address, String contactNumber,String semester) {
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



