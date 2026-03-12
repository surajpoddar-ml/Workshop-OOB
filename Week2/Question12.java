package Week2;

public class Question12 {

	public static void main(String[] args) {
		 int x = 10;
	        
	        while (x < 20) {
	            System.out.println(x);
	            
	            if (x == 15) {
	                break;
	            }
	            
	            x++;
	        }
	        
	        System.out.println("Program exited after breaking at x = " + x);
	    }
	}