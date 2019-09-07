package selection_sort;

public class SelectionSortDemo {

	private static void sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int min = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min = j;
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			if(i!=min) {
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
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
		int[] ar = { 38,11,18,2,49,34,13,1  };
		//int[] ar = {2,11,13,18,34,38,49};
		long st = System.currentTimeMillis();
		sort(ar);
		long end = System.currentTimeMillis();
		print(ar);
		System.out.println("The time taken for selection sorting is "+((end-st))+" millseconds ");

	}

}
