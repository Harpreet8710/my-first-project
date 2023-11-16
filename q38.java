package assignment;
import java.util.Scanner;

public class q38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		 System.out.print("Enter a positive integer (N): ");
	        int Num = kb.nextInt();
	        int sum = 0;
	        int i = 1;

	        if (Num <= 0) {
	            System.out.println("Please enter a positive integer.");
	        } else {
	            do {
	                sum += i;
	                i++;
	            } while (i <= Num);

	            System.out.println("The sum of natural numbers from 1 to " + Num + " is: " + sum);
	        }

	}

}
