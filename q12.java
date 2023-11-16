package assignment;
import java.util.Scanner;
public class q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb =new Scanner(System.in);
		System.out.println("please Enter a character:");
		char num1 = kb.next().charAt(0);
		char low = Character.toLowerCase(num1);
		if(low =='a' || low =='e'||low=='i'||low=='o' || low=='u') {
			System.out.println("the character is vowel");
		}else
		{
			System.out.println("the character is constant");
		}

	}

}
