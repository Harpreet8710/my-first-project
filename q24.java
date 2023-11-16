package assignment;
import java.util.Scanner;

public class q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("ENTER ANY NUMBER:");
		int num = kb.nextInt();
		 if (num % 2 == 0) {
	            System.out.println(num + " is even.");
	        } else {
	            System.out.println(num + " is odd.");
	        }
		 boolean isprime=true;
		 if(num<1) {
			 isprime = false;
		 }
		 for(int i=2;i<=num/2;i++) {
			 if((num%i) == 0) {
				 isprime =false;
			 }
		 }
		 if(isprime) {
			 System.out.print("your num is prime");
			 
		 }else {
			 System.out.print("your num is not prime");
		
		

	}
		 kb.close();

	}
}
