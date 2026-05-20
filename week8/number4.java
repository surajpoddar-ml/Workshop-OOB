package week8;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

// TASK 13
public class number4 {

	public static void main(String[]  args) {
		
		int wordCount = 0;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("files/one.txt"));
			 
					
			String line;
			
			while ((line = br.readLine()) != null) {
				String[] words = line.trim().split("\\s+");
				if (!line.trim().isEmpty()) {
					wordCount += words.length;
				}
			}
			br.close();
			System.out.println("Total number in the word file is: "+ wordCount);
			
		}
		catch (IOException e) {
			System.out.println("There has been an error occurred");
			e.printStackTrace();
			
		}
	}
}
