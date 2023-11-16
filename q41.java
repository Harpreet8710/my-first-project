package assignment;
import java.util.Scanner;

public class q41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		 System.out.print("Enter a number: ");
	        int number = kb.nextInt();
	        int reversedNumber = 0;

	        do {
	            int remainder = number % 10;
	            reversedNumber = reversedNumber * 10 + remainder;
	            number = number / 10;
	        } while (number > 0);

	        System.out.println("Reversed number: " + reversedNumber);

	}

}
