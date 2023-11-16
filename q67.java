package assignment1;

public class q67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]=new int[] {23,25,67,12,89,24,15,76};
		int smallest = numbers[0];
		int largest = numbers[0];
		for(int i =1;i<numbers.length; i++) {
			if(numbers[i]>largest)
				largest = numbers[i];
			else if(numbers[i]<smallest)
			smallest = numbers[i];
		}
		System.out.println("largest number is :" +largest);
		System.out.println("smallest number is :" +smallest);
		
		
		}

	


}
