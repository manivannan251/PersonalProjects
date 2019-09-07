package bubble_sort_demo;

public class BubbleSortDemo {

	private static void sort(int[] arr) {
		int size = arr.length;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	static void print(int[] ar) {
		System.out.print("[ ");
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+(i==ar.length-1?"":","));
		}
		System.out.println(" ] ");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] ar = {4,32,38,10,12,36,33,38,4,14,27,4};
		int[] ar = { 4,4,4,10,12,14,27,32,33,36,38 };
		long st = System.currentTimeMillis();
		sort(ar);
		long end = System.currentTimeMillis();
		print(ar);
		System.out.println("The time taken for sorting is "+((end-st))+" millseconds ");

	}

}
