package assignment;

public class q65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	        int[] arr = {0, 2, 0, 5, 0, 8, 0, 4, 6};
	        moveZerosToEnd(arr);
	        
	        // Display the modified array
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	}

	    
	    
	    static void moveZerosToEnd(int[] arr) {
	        int n = arr.length;
	        int nonZeroIndex = 0;

	        
	        for (int i = 0; i < n; i++) {
	            if (arr[i] != 0) {
	                
	                int temp = arr[i];
	                arr[i] = arr[nonZeroIndex];
	                arr[nonZeroIndex] = temp;
	                nonZeroIndex++;


	}

	       
