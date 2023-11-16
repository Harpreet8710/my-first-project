package assignment;
import java.util.Scanner;

public class q54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		 int left = 0;
		 int[] numbers = { 10, 5, 8, 20, 3, 15 };
	        int right = numbers.length - 1;

	        while (left < right) {
	            
	            int temp = numbers[left];
	            numbers[left] = numbers[right];
	            numbers[right] = temp;

	        
	            left++;
	            right--;
	        }
	    }

	    public static void printArray(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();

	}

}
