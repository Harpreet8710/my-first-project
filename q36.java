package assignment;
import java.util.Scanner;

public class q36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		 System.out.print("Enter a number: ");
	        double number = kb.nextDouble();
	        double square = 0;
	        
	        System.out.print("Enter a number: ");
	        
	        
	        while (number != 0) {
	            square += number; 
	            number--;
	        }
	        
	        System.out.println("The square of the number is: " + square);
	        
	     
	    }
	}
	
	





	


