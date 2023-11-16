package assignment;
import java.util.Scanner;
public class q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("please give me a number:");
		int num=kb.nextInt();
		if(num % 3 == 0 && num % 5 == 0) {
			System.out.println("the number is multiple of 3 and 5.......!");
		}else {
			System.out.println("the number is not multiple of 3 and 5");
		}
         kb.close();
	}

}
