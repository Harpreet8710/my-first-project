package assignment;
import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb= new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = kb.nextInt();
		System.out.println("Enter the second number");
		int num2 = kb.nextInt();
		System.out.println("Enter the third number");
		int num3 = kb.nextInt();
		kb.close();
		System.out.println("the average of entered numbers is:" + avr(num1,num2,num3));
	}
	public static int avr(int a, int b, int c)
	{
		return(a+b+c)/3;
		

	}



	}


