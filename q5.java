package assignment;
import java.util.Scanner;
public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner kb= new Scanner(System.in);
	       System.out.print("enter the number:");
	       double num=kb.nextDouble();
	       double absnum;
	       if(num<0) {
	    	   absnum = (-1)*num;
	       }
	       else
	       {
	    	   absnum =num;
	       }
	       System.out.println("the absolute number is"+absnum);
	       

	}

}
