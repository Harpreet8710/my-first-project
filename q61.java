package assignment;

public class q61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 5, 8, 3, 9, 12, 7};
        int secondSmallest = findSecondSmallest(arr);
        
        System.out.println("The second smallest element in the array is: " + secondSmallest);
    
    
  
        if (arr.length < 2) {
            System.out.println("Array should have at least 2 elements.");
         // Error value
        }
        
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element found.");
            return -1; // Error value
        }
        

	}

}
