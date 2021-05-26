// check if a array is sorted
package arrays;

public class ArraySortedDemo {

	public static void main(String[] args) {
		int[] test1 = {55,34,98,203};
		System.out.println(isSorted(test1));

	}
	
	private static boolean isSorted(int[] arr) {
		boolean sorted = true;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1])
				sorted = false;
		}
		return sorted;
	}

}
