//Re arrange arrays such that arr[i] = i 
package arrays_examples;

import java.util.HashSet;
import java.util.Set;

public class ReArrangeArrays {

	public static void main(String[] args) {
		
		int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
		System.out.println("Before Rearranging array");
		displayArr(arr);
		System.out.println("After rearranging array");
		reArrangeArray1(arr);
		
	}
	
	
	private static void reArrangeArray1(int[] arr) {
		
		Set<Integer> num = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			num.add(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==i)
				continue;
			else {
				if(num.contains(i))
					arr[i]=i;
				else
					arr[i]=-1;
			}
		}
		displayArr(arr);
	}
	
	private static void displayArr(int[] a) {
		System.out.print("[ ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
			if(i!=a.length-1)
				System.out.print(",");
		}
		System.out.println("]");
	}

}
