package assignment;
import java.util.Scanner;

public class q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("please give me a number1:");
		 double num1 =kb.nextDouble();
	       System.out.print("please give me a number2:");
	       double num2 =kb.nextDouble();
	       System.out.println("please give me a number3:");
	       double num3 =kb.nextDouble();
	       System.out.println("please give me a number3:");
	       double num4 =kb.nextDouble();
	       
	       double largest;
	       if(num1>=num2 && num1>=num3 && num1 >= num4) {
	    	   largest= num1;
	       }else if(num2>=num1 && num2>= num3 && num2 >= num4) {
	    	   largest =num2;
	       }else if (num3>=num1 && num3 >=num2 && num3>= num4) {
	    	   largest = num3;
	       }else {
	    	   largest = num4;
	       }

	}

}
