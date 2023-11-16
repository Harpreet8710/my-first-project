package assignment;
import java.util.Scanner;

public class q32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = 10; // Change this value to generate a different number of Fibonacci numbers

        int firstNum = 0;
        int secondNum = 1;
        int count = 0;

        System.out.println("Fibonacci Series of " + n + " numbers:");

        while (count < n) {
            System.out.print(firstNum + " ");

            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;

            count++;

	}

}

}