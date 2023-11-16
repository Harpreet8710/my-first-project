package assignment;
import java.util.Scanner;

public class q40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		 System.out.print("Enter the number of terms: ");
	        int number = kb.nextInt();
	

	        System.out.println("Fibonacci Series:");

	        int i = 1;
	        do {
	            System.out.print(firstTerm + " ");
	            int nextTerm = firstTerm + secondTerm;
	            firstTerm = secondTerm;
	            secondTerm = nextTerm;
	            i++;
	        } while (i <= number);

	}

}
