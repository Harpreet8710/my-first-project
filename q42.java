package assignment;
import java.util.Scanner;

public class q42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the base number: ");
        double base = kb.nextDouble();

        System.out.print("Enter the exponent: ");
        int exponent = kb.nextInt();

        double result = 1.0;
        int count = 0;

        do {
            result *= base;
            count++;
        } while (count < exponent);

        System.out.println(base + " raised to the power of " + exponent + " is: " + result);


	}

}
