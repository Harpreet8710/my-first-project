package assignment;
import java.util.Scanner;

public class q34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
	
        System.out.println("Multiplication using value? : ");
        int num =kb.nextInt();
        int i=kb.nextInt();
        
        while(num <= 10) {
        	 System.out.println(num+ " * ", +i, " = ", + num*i);
        	i++;
        }
		   
	}
	

}