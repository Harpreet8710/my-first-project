package assignment;
import java.util.Scanner;
public class q58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

         commonElements = (array1,array2);

        System.out.println("Common elements between the two arrays are: " + commonElements);
    }

    public static findCommonElements(int[] array1, int[] array2) {
        commonElements = new ArrayList();
        
        
        array2List = new ArrayList();
        for (int num : array2) {
            array2Arraylist.add(num);
        }

        for (int num : array1) {
            if (array2List.contains(num)) {
                commonElements.add(num);
            }
        }

        return commonElements;
    }

	}

}
