package assignment;
import java.util.Scanner;

public class q30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a positive integer number N: ");
        int num = kb.nextInt();
        
        int sum = 0;
        int i = 1;
        
        while (i <= num) {
            sum += i;
            i++;
        }
        
        System.out.println("The sum of natural numbers from 1 to " + num + " is: " + sum);

	}

}
