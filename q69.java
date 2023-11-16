package assignment1;

public class q69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array= {12,45,34,-6,4,3,0,-1};
		boolean val = false;
		for (int i = 0; i < array.length; i++) {
			if(array[i]<= 0) {
				val =true;
				break;
			}
		}
		if(!val) {
			System.out.println("array does not conntain 0 and -1");
			return;
			
		}
		else
			System.out.println("array  contain 0 and -1");
			
		

	}

}
