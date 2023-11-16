package assignment1;

import java.util.Arrays;

public class q71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array= {12,45,30,65,65,77,10,3,0,-1};
		System.out.println("orignal array : " +Arrays.toString(array));
        int num1 = 77;
        int num2 = 65;
        
        System.out.println("result:"  +result(array,num1,num2));
	}
        public static boolean result(int[]numbers,int num1, int num2) {
        	
        	
			for(int number: numbers ) {
        		boolean r = number != num1 && number != num2;
        		if(r) {
        			return false;
        		}
        	}
        	return true;
			
		

	}

}
