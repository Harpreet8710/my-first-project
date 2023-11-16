package assignment;
import java.util.Scanner;

public class q51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		 int[] firstArray = {10, 22, 55, 44, 55};
	        int[] copiedArray = new int[firstArray.length];
	        
	        
	        for (int i = 0; i < firstArray.length; i++) {
	            copiedArray[i] = firstArray[i];
	        }
	        
	       
	        System.out.println("Original Array:");
	        for (int num : firstArray) {
	            System.out.print(num + " ");
	        }
	        
	        System.out.println("Copied Array:");
	        for (int num : copiedArray) {
	            System.out.print(num + " ");

	}

}
}
