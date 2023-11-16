package assignment;

public class q77 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original Array: ");
        printArray(arr);

        rotateArrayClockwise(arr);

        System.out.println("\nArray after Cyclic Rotation: ");
        printArray(arr);
    }

    public static void rotateArrayClockwise(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int lastElement = arr[arr.length - 1];

        
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

       
        arr[0] = lastElement;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}