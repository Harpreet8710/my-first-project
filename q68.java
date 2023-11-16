package assignment1;

public class q68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array= {12,45,34,78,12,21,34,1,23,22,45};
		int length = array.length;
		int sum = 0;
		for (int i = 0; i <array.length; i++) {
			sum += array[i];
		}
		double average = sum / length;
		System.out.println("Average of array : " +average);
		
		

	}

}
