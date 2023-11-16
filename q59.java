package assignment;
import java.util.Scanner;

public class q59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

        int[] inputArray = {1, 2, 3, 2, 4, 5, 3, 6};

       
        for (int element : inputArray) {
            uniqueElementsSet.add(element);
        }

        // Convert the HashSet back to an array
        int[] resultArray = new int[uniqueElementsSet.size()];
        int index = 0;
        for (int element : uniqueElementsSet) {
            resultArray[index++] = element;
        }

        // Print the array with duplicates removed
        System.out.println("Original Array: " + Arrays.toString(inputArray));
        System.out.println("Array with Duplicates Removed: " + Arrays.toString(resultArray));

	}

}
