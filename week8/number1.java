package week8;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class number1 {

	public static void main(String[] args) {
		
		try {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("files/one.txt"));
			
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("files/two.txt"));
			
			int data;
			
			while((data = bis.read()) !=-1) {
				bos.write(data);
			}
			
			bis.close();
			bos.close();
			
			System.out.println("Files have been copied");
			
		}
		
		catch (IOException e ) {
			System.out.println("There has been an error");
			e.printStackTrace();
			
		}
	}
}
