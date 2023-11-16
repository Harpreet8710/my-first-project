package assignment;

import java.util.Scanner;

public class q43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a number: ");
        double number=kb.nextDouble();
        
        do {
            
               double square = number * number;
                System.out.println("The square of " + number + " is " + square);
            }
            
         while (true);

        
    }


}


