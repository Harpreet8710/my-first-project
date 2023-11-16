package assignment;
import java.util.Scanner;

public class q46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = kb.nextInt();

        
        System.out.print("Enter the range: ");
        int range = kb.nextInt();

        System.out.println("Multiplication table for " + number +  + range + ":");
        
        
        for (int i = 1; i <= range; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }


	}

}
