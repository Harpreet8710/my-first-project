package assignment;
import java.util.Scanner;

public class q53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int[] numbers = { 10, 5, 8, 20, 3, 15 };

        int maximum = numbers[0]; // Initialize max to the first element
        int minimum = numbers[0]; // Initialize min to the first element

        // Iterate through the array to find max and min values
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }

        System.out.println("Maximum value in the array: " + maximum);
        System.out.println("Minimum value in the array: " + minimum);

	}

}
