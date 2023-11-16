package assignment;

import java.util.Scanner;

public class q31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		int i = 0;
		int factorial = 0;
		while (i <= num) {
			factorial *= num;
			i++;

			System.out.println("the factorial of" + num + " is:" + factorial);
		}

	}
}
