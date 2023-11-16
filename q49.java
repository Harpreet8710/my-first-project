package assignment;
import java.util.Scanner;

public class q49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

        int[] arr1 = {10, 20, 30, 40, 50};

      
        int number = 30;

       
        int index = findIndex(arr1, number);

        if (index != -1) {
            System.out.println("Element " + number + " found at index " + index);
        } else {
            System.out.println("Element " + number+ " not found in the array");
        }
    }

   
    public static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1;

	}

}
