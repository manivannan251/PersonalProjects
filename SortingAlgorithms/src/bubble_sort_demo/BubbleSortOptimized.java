package bubble_sort_demo;

public class BubbleSortOptimized {
	private static void sort(int[] arr) {
		int size = arr.length;
		boolean swap;
		for(int i=0;i<size;i++) {
			swap = false;
			for(int j=0;j<size-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					swap = true;
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			  if(!swap) 
				  break;
			 
			
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
				int[] ar = { 4,4,4,10,12,14,27,32,33,36,38,38  };
				
				long st = System.currentTimeMillis();
				sort(ar);
				long end = System.currentTimeMillis();
				print(ar);
				System.out.println("The time taken for sorting is "+((end-st))+" millseconds ");


	}

}
