package assignment;
import java.util.Scanner;

public class q56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		 String[] array = {"apple", "banana", "cherry", "apple", "date", "banana"};

	        // Create a HashSet to store unique strings
	        uniqueStrings = new();
	        duplicateStrings = new ;

	      
	        for (String str : array) {
	            if (!uniqueStrings.add(str)) {
	                duplicateStrings.add(str);
	            }
	        }

	        // Print the duplicate values
	        System.out.println("Duplicate strings in the array: " + duplicateStrings);

	}

}
