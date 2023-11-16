package assignment;
import java.util.Scanner;

public class q39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int number = kb.nextInt();
        

         double factorial = 1;
        int i = 1;

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            do {
                factorial *= i;
                i++;
            } while (i <= number);

            System.out.println("Factorial of " + number + " is " + factorial);

	}

}
}
