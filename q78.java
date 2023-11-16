package assignment;

public class q78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int[] rotatedArray = {5, 6, 7, 8, 9, 1, 2, 3, 4};
        
        int rotationCount = findRotationCount(rotatedArray);
        
        System.out.println("Rotation Count: " + rotationCount);
    }

    public static int findRotationCount(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
           
            if (arr[low] <= arr[high]) {
                return low;
            }

            int mid = (low + high) / 2;
            int next = (mid + 1) % n;
            int prev = (mid - 1 + n) % n;

          
            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                return mid;
            }

            
            if (arr[mid] <= arr[high]) {
                high = mid - 1;
            }
           
            else if (arr[mid] >= arr[low]) {
                low = mid + 1;
            }
        }

        return -1; 
    }
}