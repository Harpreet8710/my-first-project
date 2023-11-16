package assignment;
import java.util.Scanner;

public class q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter any number:");
		int number = kb.nextInt();
		if(number%2==0 && number>0) {
			System.out.println("the given number is even and positive");
		}else {
			System.out.println("the given number is not good");
		}

	}

}
