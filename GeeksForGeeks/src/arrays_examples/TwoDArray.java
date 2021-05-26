package arrays_examples;

public class TwoDArray {

	public static void main(String[] args) {
		dispArr(genArray(3));

	}
	
	private static int[][] genArray(int num) {
		int[][] arr = new int[num][num];
		int count = 1;
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				arr[i][j] = count++;
				
			}
		}
		return arr;
	}
	
	private static void dispArr(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
