package Week2;
import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    System.out.println("To find odd and even and also detect the divisible or not");
	    float num=sc.nextFloat();
	    if (num%2==0) {
	      if  (num%4==0){
	    	  System.out.println("Yes number is even and divisible by 4");
	    	}
	      else {
	    	  System.out.println("Yes number is even but not divisible by 4");
	      }
	    }
	      
	      else {
	    	  if (num%7==0) {
	    		  System.out.println("Yes number is odd and divisible by 7");  
	    	  }
	    	  else {
		    	  System.out.println("Yes Number is odd but not divisible by 7");
		      }
	    	  sc.close();
	    	  
	      }
	    }

	}
