package algorithms.bubblesort;

import algorithms.ArrayUtils;

public class BubblSortDemo {

	public static void main(String[] args) {
		System.out.println("Starting bubble sort");
		int[] arr = ArrayUtils.generateArray(2000);
		bubbleSort(arr);
		

	}
	
	private static void bubbleSort(int[] arr) {
		System.out.println("Arrays before sorting");
		ArrayUtils.printArray(arr);
		long startTime = System.currentTimeMillis();
		for(int j=arr.length;j>0;j--) {
			for(int i=0;i<j-1;i++) {
				if(arr[i]>arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
					
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Arrays after sorting");
		ArrayUtils.printArray(arr);
		System.out.println("The time taken for sorting in milliseconds is "+(endTime-startTime));
	}
	
	
	

}
