//This programs finds the minimum element in the array
package section8;

import java.util.Scanner;

public class Arrays_chlg_101 {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] myIntegers = getIntegerArrays(5);
		System.out.println("The minimum amount is "+getMinimumElement(myIntegers));
	}
	
	private static int[] getIntegerArrays(int capacity) {
		int[] arr = new int[capacity];
		System.out.println("Enter " + capacity +" integer values:\r");
		for(int i=0;i<arr.length;i++) {
			arr[i] = scanner.nextInt();
		}
		return arr;
	}
	
	private static int getMinimumElement(int[] arr) {
		int num = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<num)
				num = arr[i];
		}
		return num;
	}

}
