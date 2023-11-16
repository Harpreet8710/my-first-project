package assignment1;

import java.util.Arrays;

public class q72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array= {20, 20, 30, 40, 50, 50, 50};
		System.out.println("orignal array : " +Arrays.toString(array));
       
        
        System.out.println("array elements are :"  );
        for(int i = 0; i < array.length; i++) {
        	System.out.println(array[i]+" "  );
        	
	}
        System.out.println("\n the new length of the array is: " + array_sort(array)  );
	}
	 public static int array_sort(int[] array){
		 int index = 1;
		 for(int i = 1; i<array.length; i++) {
			 if(array[i] != array[index - 1])
				 array[index++]= array[i];
				 
		 }
		 return index;
		 
     	
		

	}

}
