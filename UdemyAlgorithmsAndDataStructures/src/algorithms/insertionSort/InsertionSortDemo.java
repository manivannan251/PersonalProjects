package algorithms.insertionSort;

import algorithms.ArrayUtils;


public class InsertionSortDemo {

	public static void main(String[] args) {
		System.out.println("Starting insertion sort");
		//[5, 1, 2, 6, 10, 3, 6, 3, 4, 3]
		int arr[] = ArrayUtils.generateArray(3000);
		//int arr[] = new int[] {5, 1, 2, 6, 10, 3, 6, 3, 4, 3};
		//int arr[] = new int[] {20, 35, -15, 7 , 55, 1, -22};
		//insertionSort(arr);
		insertionSortFromCourse(arr);

	}
	
	private static void insertionSort(int[] arr) {
		System.out.println("Arrays before sorting");
		ArrayUtils.printArray(arr);
		long startTime = System.currentTimeMillis();
		for(int i=1;i<=arr.length-1;i++) {
			boolean found = false;
			int element = arr[i];
			for(int j=i-1;j>=0;j--) {
				if(arr[j]>element) {
					arr[j+1] = arr[j];
				}
				else {
					arr[j+1] = element;
					found=true;
					break;
				}
				
			}
			if(!found) {
				arr[0] = element;
			}
			//arr[0] = element;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Arrays after sorting");
		ArrayUtils.printArray(arr);
		System.out.println("The time taken for sorting in milliseconds is "+(endTime-startTime));
	}
	
	private static void insertionSortFromCourse(int[] arr) {
		System.out.println("Arrays before sorting");
		ArrayUtils.printArray(arr);
		long startTime = System.currentTimeMillis();
		for(int firstUnsortedIndex = 1;firstUnsortedIndex < arr.length;firstUnsortedIndex++) {
			int newElement = arr[firstUnsortedIndex];
			
			int i;
			for(i=firstUnsortedIndex;i>0 && arr[i-1] > newElement;i-- ) {
				arr[i] = arr[i-1];
			}
			arr[i] = newElement;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Arrays after sorting");
		ArrayUtils.printArray(arr);
		System.out.println("The time taken for sorting in milliseconds is "+(endTime-startTime));
	}

}
