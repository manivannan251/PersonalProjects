package algorithms.shellsort;

import algorithms.ArrayUtils;

public class ShellSortDemo {

	public static void main(String[] args) {
		System.out.println("Starting insertion sort");
		//int arr[] = new int[] {20, 35, -15, 7 , 55, 1, -22};
		int arr[] = ArrayUtils.generateArray(3000);
		//shellSortDemo(arr);
		shellSortFromCourse(arr);

	}
	
	private static void shellSortDemo(int[] arr) {
		System.out.println("Arrays before sorting");
		ArrayUtils.printArray(arr);
		long startTime = System.currentTimeMillis();
		int gap = arr.length/2;
		while(gap>=1) {
			for(int i=gap;i<=arr.length-1;i++) {
				int newElement = arr[i];
				int j;
				for(j=i;j-gap>=0 && arr[j-gap]>newElement;j=j-gap) {
					arr[j] = arr[j-gap];
				}
				arr[j] = newElement;
			}
			gap = gap/2;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Arrays after sorting");
		ArrayUtils.printArray(arr);
		System.out.println("The time taken for sorting in milliseconds is "+(endTime-startTime));
	}
	
	private static void shellSortFromCourse(int[] arr) {
		System.out.println("Arrays before sorting");
		ArrayUtils.printArray(arr);
		long startTime = System.currentTimeMillis();
		for(int gap = arr.length/2;gap>0;gap/=2) {
			
			for(int i=gap;i<arr.length;i++) {
				int newElement = arr[i];
				int j=i;
				while(j>=gap&&arr[j-gap]>newElement) {
					arr[j] = arr[j-gap];
					j-=gap;
				}
				arr[j] = newElement;
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Arrays after sorting");
		ArrayUtils.printArray(arr);
		System.out.println("The time taken for sorting in milliseconds is "+(endTime-startTime));
	}

}
