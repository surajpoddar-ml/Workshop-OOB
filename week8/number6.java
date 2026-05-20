package week8;
import java.io.*;
import java.util.*;

public class number6 {
	
	public static void main(String [] args) {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("files/products.txt"));
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("files/prices.csv"));
			
			
			Map<String, Integer> totalMap = new HashMap<>();
			Map <String, Integer> countMap = new HashMap<>();
			
			String line;
			
			
			while ((line= br.readLine()) != null) {
				if (line.contains("product;price")) {
					continue;
				}
				String[] parts = line.trim().split(";");
				String product = parts[0];
				Integer price = Integer.parseInt(parts[1]);
				
				if (totalMap.containsKey(product)){
					Integer oldPrice = totalMap.get(product);
					Integer newPrice = oldPrice + price;
					totalMap.put(product, newPrice);
					
					Integer count = countMap.get(product) + 1;
					countMap.put(product, count);
					
					 
				}
				else {
					totalMap.put(product, price);
					countMap.put(product, 1);
				}
				
				
			}
			
			for (String product : totalMap.keySet()) {
				int total = totalMap.get(product);
				int count = countMap.get(product);
				
				int average = total / count;
				
				System.out.println(product+","+average);
				
				bw.write(product+","+average);
				bw.newLine();
			}
			
			br.close();
			bw.close();
		}
		
	
		catch (IOException e) {
		
			System.out.println("There has been an error.");
			e.printStackTrace();
		}
	}
}
