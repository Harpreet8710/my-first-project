package assignment;
import java.util.Scanner;

public class q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb= new Scanner(System.in);
		System.out.println("ENTER ANY NUMBER:");
		int days = kb.nextInt();
	
		switch(days) {
		case 1:
			System.out.println("Sunday:");
			break;
		case 2:
			System.out.println("Monday:");
			break;
		case 3:
			System.out.println("tuesday");
			break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			System.out.println("thursday:");
			break;
		case 6:
			System.out.println("friday");
			break;
		case 7:
			System.out.println("saturday");
			break;
			default:
				System.out.println("invalid day:");
		}
		kb.close();
		
		} 
			
		

	}


