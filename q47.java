package assignment;

import java.util.Scanner;

public class q47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int[] numbers = { 10, 15, 7, 12, 22 };

		double sum = 0;
		for (int i = 0; i < numbers.length; i++) {//for(double n :numbers)
			sum += numbers[i];//sum = sum +n;
		}


		double average = sum / numbers.length;


		System.out.println("Array elements: " + java.util.Arrays.toString(numbers));
		System.out.println("Average value: " + average);
	}
}
