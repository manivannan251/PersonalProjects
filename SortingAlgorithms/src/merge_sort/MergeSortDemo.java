package merge_sort;

public class MergeSortDemo {

	public static void main(String[] args) {
		int[] ar = { 38,11,18,2,49,34,13,1  };
		System.out.println("The values of arrays before sorting");
		printArray(ar);

	}
	
	private static void printArray(int[] arr) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+(i==arr.length-1?"":","));
		}
		System.out.println("]");
	}
	
	private static void mergeSort(int[] arr,int l,int r) {
		
		if(r-l<2)
			return;
		
		int m = (l+r)/2;
		mergeSort(arr, l, m);
		mergeSort(arr, m, r);
		
	}

}
