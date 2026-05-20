package week8;
import java.io.*;
import java.util.*;

public class number7 {

	public static void main(String[] args) {
		
	try{
		BufferedReader br = new BufferedReader(new FileReader("files/CSVStudentFilenum5.csv"));
		
		BufferedWriter firstNamefile = new BufferedWriter(new FileWriter("files/firstName.txt"));
		
		BufferedWriter lastNamefile = new BufferedWriter(new FileWriter("files/lastName.txt"));
		
		BufferedWriter addressfile= new BufferedWriter(new FileWriter("files/address.txt"));
		
		BufferedWriter numberFile = new BufferedWriter(new FileWriter("files/number.txt"));
		
		
		List <String> firstName = new ArrayList<>();
		List <String> lastName = new ArrayList<>();
		List <String> address = new ArrayList<>();
		List <String> number = new ArrayList<>();
		List <String> semester = new ArrayList<>();		
				
		String line;
		
		while ((line= br.readLine()) != null) {
			String[] parts = line.trim().split(",");
			String firstName1 = parts[0];
			String lastName1 = parts[1];
			String address1 = parts[2];
			String number1 = parts[3];
			String semester1 = parts[4];
			
			
			firstName.add(firstName1);
			lastName.add(lastName1);
			address.add(address1);
			number.add(number1);
			semester.add(semester1);
			
			
			
		}
		
		for (String index: firstName) {
			
		}
		
		
		
	}	
	catch (IOException e){
		System.out.println("There has been an error.");
		e.printStackTrace();
	}
	}
}
