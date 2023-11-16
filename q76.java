package assignment;

import java.util.Arrays;

public class q76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int[] arr = {4, 3, 5, 7, 6};

		        int count = countTriangles(arr);

		        System.out.println("Number of triangles: " + count);
		    }

		    public static int countTriangles(int[] arr) {
		        Arrays.sort(arr);

		        int n = arr.length;
		        int count = 0;

		        for (int i = 0; i < n - 2; i++) {
		            int k = i + 2;

		            for (int j = i + 1; j < n; j++) {
		              while (k < n && arr[i] + arr[j] > arr[k]) {
		                    k++;
		                }

		                count += k - j - 1;
		            }
		        }

		        return count;
		    }
	
	}
	
