package assignment;

import java.util.Scanner;

public class q52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int[] originalArray1 = { 11, 12, 13, 14, 15 };
	}
	public static int[]insertElement(int[]array,int,val,int,pos){
		intmylen = array.length;
		int newarray = array.length;
		int newarray[]

		
		int new1 = 10;

		
		int position = 2;

		
		if (position < 0 || position > originalArray1.length) {
			System.out.println("Invalid position to insert the element.");
		} else {
			
			int[] newArray = new int[originalArray1.length + 1];

			
			for (int i = 0; i < position; i++) {
				newArray[i] = originalArray1[i];
			}

			
			newArray[position] = new1;

			
			for (int i = position + 1; i < newArray.length; i++) {
				newArray[i] = originalArray1[i - 1];
			}

			
			System.out.println("Original Array: " + Arrays.toString(originalArray1));
			System.out.println("Element " + position + " inserted at position " + position);
			System.out.println("Updated Array: " + Arrays.toString(newArray));
		}

	}

}
