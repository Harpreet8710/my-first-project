package assignment1;

public class q75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        int nums[] = {10, 20, 3, 4, 1, 2};
        int n = nums.length;
        
        
        int s = 53;
        System.out.println("Given value: " + s);
        System.out.print("Combination of four elements:");

        
        for (int i = 0; i < n - 3; i++) 
        {
           
            for (int j = i + 1; j < n - 2; j++) 
            {
                
                for (int k = j + 1; k < n - 1; k++) 
                {
                    
                    for (int l = k + 1; l < n; l++) 
                    {
                        
                        if (nums[i] + nums[j] + nums[k] + nums[l] == s) 
                            System.out.print("\n" + nums[i] + " " + nums[j] + " " + nums[k] + " " + nums[l]);
                    }
                }
            }
        }
	}
}
        
        


	
