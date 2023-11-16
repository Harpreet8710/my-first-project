package assignment;
import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb= new Scanner(System.in);
		System.out.print("enter the number:");
		int num = kb.nextInt();
		if(num<0) {
			System.out.println("can't do the factorial for negative");
			
		}else {
			int fact =1;
			for(int i =1;i<=num;i++) {
				fact=fact*i;
			}
			System.out.println("the factorial is"+fact);
		}
		kb.close();
		
		
		
		

	}

}
