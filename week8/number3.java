package week8;
import java.io.*;
import java.util.List;
import java.util.ArrayList;


public class number3 {

	public static void main(String[] args) {
		
		number3 obj = new number3();
		
		List<Integer> numbers = obj.read("files/numbers.txt");
		
		List<Integer> evenNumbers = obj.getEven(numbers);
		List<Integer> oddNumbers = obj.getOdd(numbers);
		
		obj.write(oddNumbers, "files/oddNum.txt");
		obj.write(evenNumbers, "files/evenNum.txt");
		
		System.out.println("The Odd and Even numbers have been saved on respective files. Please check in the Medias Folder.");
		
	}
	
	
	public List<Integer> read(String filePath){
		
		List<Integer> numbers = new ArrayList<>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			
			String line = br.readLine();
			 if (line!=null) {
				 
				 String[] parts = line.trim().split("\\s+");
				 for (String num: parts) {
					 numbers.add(Integer.parseInt(num));
				 }
			 }
			 br.close();
		}
		catch (IOException e) {
			System.out.println("There has been an error");
			e.printStackTrace();
		}
		return numbers;
	}
	
	
	public List<Integer> getEven(List<Integer> numbers) {
		List<Integer> even = new ArrayList<>();
		
		for (int num: numbers) {
			if (num%2==0) {
				even.add(num);
			}
		}
		return even;
	}
	
	public List<Integer> getOdd(List<Integer> numbers) {
		List<Integer> odd = new ArrayList<>();
		
		for (int num: numbers) {
			if (num%2!=0) {
				odd.add(num);
			}
		}
		return odd;
	}
	
	public void write(List<Integer> numbers, String filePath) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
			for (int num: numbers) {
				bw.write(num+" ");
				
			}
			bw.close();
		}
		catch (IOException e) {
			System.out.println("There has been an error");
			e.printStackTrace();
		}
	}
	
}

