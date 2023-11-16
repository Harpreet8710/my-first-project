package assignment;

public class q60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {10, 25, 5, 15, 30, 20};
        int largest = Integer.MIN_VALUE; 
        int secondLargest = Integer.MIN_VALUE; 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest element in the array is: " + secondLargest);
        } else {
            System.out.println("There is no second largest element in the array.");
        }


	}

}
