package assignment;
import java.util.Scanner;

public class q48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5};
        
        
        int number = 3;
        
        
        boolean value = false;
        
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                value = true;
                break;
            }
        }
        
       
        if (value) {
            System.out.println("The array contains the value " + number);
        } else {
            System.out.println("The array does not contain the value " + number);
        }
    }

	}


