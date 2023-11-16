package assignment;
import java.util.Scanner;

public class q45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
        int number = kb.nextInt();
       

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            double factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);

	}

}
}
