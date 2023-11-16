package assignment;
import java.util.Scanner;

public class q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("plese enter any number:");
		int num = kb.nextInt();
		if(num>0) {
			System.out.println("the given number is positive");
		}else if(num<0) {
			System.out.println("the given number is negative");
		}else {
			System.out.println("the given number is zero");
		}


	}

}
