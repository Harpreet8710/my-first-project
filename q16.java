package assignment;
import java.util.Scanner;

public class q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		 System.out.print("please give me number:");
		 int num =kb.nextInt();
		   
		  
			   int sqrootnum =(int)Math.sqrt(num);
			   if(sqrootnum*sqrootnum == num) {
		   
		       System.out.print("thats perfect sqr  " );
		       
		       
		       
		   }
			   else {
				   System.out.print("thats not perfect sqr  " );
			   }
	}

}
