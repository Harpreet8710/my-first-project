package assignment;
import java.util.Scanner;

public class q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb =new Scanner(System.in);
		System.out.println("please enter a year:");
		int year = kb.nextInt();
		if(((year % 4 == 0) && year % 100!=0)||(year % 400 == 0)){
			System.out.println("this is a leap year");
		}else {
			System.out.println("this is not a leap year");
		}

	}

}
