package assignment1;

import java.util.Arrays;

public class q70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array= {12,45,30,-6,10,3,0,-1};
		System.out.println("orignal array : " +Arrays.toString(array));
        int search_num = 10;
        int fixed_sum = 30;
        System.out.println("result:"  +result(array,search_num,fixed_sum));
	}
        public static boolean result(int[]numbers,int search_num, int fixed_sum) {
        	int temp_sum = 0;
        	for(int number:numbers) {
        		if(number == search_num) {
        			temp_sum+=search_num;
        		}
        		if(temp_sum > fixed_sum) {
        			break;
        			
        		}
        	}
        	return temp_sum == fixed_sum;
        
        
	}

}
