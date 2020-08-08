package algorithms;

public class ArrayUtils {
	
	public static int[] generateArray(int num) {
		int[] arr = new int[num];
		for(int i=0;i<arr.length;i++) {
			if(num < 100) {
				arr[i] = getRandomIntegerBetween(0,100);
			}
			else {
				arr[i] = getRandomIntegerBetween(0,num);
			}
			
		}
		return arr;
	}
	
	public static int getRandomIntegerBetween(int start,int end) {
		return (int ) ((Math.random()*((end-start)+1))+start);
	}
	
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			if(!(i==(arr.length-1)))
				System.out.print(", ");
			
		}
		System.out.println("]");
	}
}
