package assignment;
import java.util.Scanner;

public class q50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
        int[] array1 = {1, 2, 3, 4, 5};

        
        int remove = 3;

        
        int indexToRemove = -1;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == remove) {
                indexToRemove = i;
                break;
            }
        }

      
        if (indexToRemove != -1) {
            int[] newArray = new int[array1.length - 1];
            for (int i = 0, j = 0; i < array1.length; i++) {
                if (i != indexToRemove) {
                    newArray[j] = array1[i];
                    j++;
                }
            }
            
           
            System.out.println("Original Array: " + Arrays.toString(array1));
            System.out.println("Array after removing " + remove + ": " + Arrays.toString(newArray));
        } else {
            
            System.out.println("Element not found in the array.");


	}

}
}