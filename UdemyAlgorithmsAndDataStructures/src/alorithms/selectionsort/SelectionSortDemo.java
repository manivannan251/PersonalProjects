package alorithms.selectionsort;

import algorithms.ArrayUtils;

public class SelectionSortDemo {

	public static void main(String[] args) {
		System.out.println("Starting selection sort");
		int[] arr = ArrayUtils.generateArray(4000);
		//selectionsort(arr);
		selectionSortFromCourse(arr);

	}
	
	//From course
	private static void selectionSortFromCourse(int[] arr) {
		System.out.println("Arrays before sorting");
		ArrayUtils.printArray(arr);
		long startTime = System.currentTimeMillis();
		for(int lastUnsortedIndex=arr.length-1;lastUnsortedIndex >0;lastUnsortedIndex--) {
			int largest = 0;
			for(int i=1;i<=lastUnsortedIndex;i++) {
				if(arr[i]>arr[largest]) {
					largest = i;
				}
			}
			int temp = arr[lastUnsortedIndex];
			arr[lastUnsortedIndex] = arr[largest];
			arr[largest] = temp;
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("Arrays after sorting");
		ArrayUtils.printArray(arr);
		System.out.println("The time taken for sorting in milliseconds is "+(endTime-startTime));
	}
	
	//My Method
	private static void selectionsort(int[] arr) {
		System.out.println("Arrays before sorting");
		ArrayUtils.printArray(arr);
		long startTime = System.currentTimeMillis();
		for(int j=arr.length-1;j>0;j--) {
			int maxIndex = 0;
			for(int i=1;i<=j;i++) {				
				if(arr[i]>arr[maxIndex]) {
					maxIndex=i;
					
				}
				if(i==j) {
					int temp = arr[i];
					arr[i] = arr[maxIndex];
					arr[maxIndex] = temp;
				}
					
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Arrays after sorting");
		ArrayUtils.printArray(arr);
		System.out.println("The time taken for sorting in milliseconds is "+(endTime-startTime));
	}

}
