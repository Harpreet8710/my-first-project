package assignment;
import java.util.Scanner;

public class q55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		 int[] array = {1, 2, 3, 2, 4, 5, 6, 4, 7, 8, 9, 9};

	        

		 for (int num : array) {
	            if (elementCountMap.containsKey(num)) {
	                elementCountMap.put(num, elementCountMap.get(num) + 1);
	            } else {
	                elementCountMap.put(num, 1);
	            }
	        }
	        
	        // Print duplicate elements
	        System.out.println("Duplicate elements in the array:");
	        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey());
				}
			}
	}
}