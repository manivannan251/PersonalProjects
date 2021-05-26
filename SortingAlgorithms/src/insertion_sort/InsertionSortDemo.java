package insertion_sort;

import java.util.Arrays;

public class InsertionSortDemo {

	public static void main(String[] args) {
		int[] ar = { 38,11,18,2,49,34,13,1  };
		System.out.println("The values of arrays before sorting");
		prinArray(ar);
		insertionSort(ar);
		System.out.println("The values of arrays after sorting");
		prinArray(ar);

	}
	
	
	private static void prinArray(int[] arr) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+(i==arr.length-1?"":","));
		}
		System.out.println("]");
	}
	
	private static void insertionSort(int[] arr) {
		
		for(int unsortedIndex=1;unsortedIndex<arr.length;unsortedIndex++) {
			int newElement = arr[unsortedIndex];
			
			int i;
			
			for(i=unsortedIndex;i>0 && arr[i-1] > newElement;i-- ) {
				arr[i] = arr[i-1];
			}
			
			arr[i] = newElement;
		}
	}

}
