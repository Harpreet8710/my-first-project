package assignment;

public class q64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    public static int findMissingNumber(int[] nums, int n) {
	        int xorSum = 0;

	        // XOR all the numbers in the given array
	        for (int num : nums) {
	            xorSum ^= num;
	        }

	        // XOR all the numbers from 1 to n
	        for (int i = 1; i <= n; i++) {
	            xorSum ^= i;
	        }

	        return xorSum;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 4, 6, 3, 7, 8};
	        int n = arr.length + 1; 

	        int missingNumber = findMissingNumber(arr, n);

	        System.out.println("The missing number is: " + missingNumber);

	}

}
