package assignment;
import java.util.Scanner;
public class q22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("enter a quadric number:");
		double num1 = kb.nextDouble();
		System.out.println("please enter a second equation here:");
		double num2 = kb.nextDouble();
		System.out.println("please enter a third equation here:");
		double num3 = kb.nextDouble();
		
		double delta = (num2 * num3)-4 * num1 *num3;
		if(delta > 0) {
			double root1 = (-num2 + Math.sqrt(delta))/(2*num1);
			double root2 = (-num2 + Math.sqrt(delta))/(2*num1);
			System.out.print("the root one is : " +root1);
			System.out.print("the root two is : " +root2);
		}else if(delta == 0) {
			double roots = -num2 /(2 * num1);
			System.out.println("the one root  is : " +roots);
			
		}else {
			System.out.println("you don't have a root");
			
		}

		
		
		
		

	}

}
//by method

