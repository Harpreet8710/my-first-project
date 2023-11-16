package assignment;

public class q57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array1 = {"apple", "banana", "cherry", "date", "fig"};
        String[] array2 = {"date", "fig", "grape", "banana", "kiwi"};
        set1 =new array;
        commonElements=arrays;
        for (String element : array1) {
            set1.add(element);
        }

        
        for (String element : array2) {
            if (set1.contains(element)) {
                commonElements.add(element);
            }
        }

        
        System.out.println("Common elements between the two arrays are:");
        for (String element : commonElements) {
            System.out.println(element);


	}

}
