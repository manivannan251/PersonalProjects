package section5_coding_exercise;

public class SumOddDemo {

	public static void main(String[] args) {
		System.out.println(isOdd(9));
		System.out.println(isOdd(8));
		System.out.println(sumOdd(1, 100));
		System.out.println(sumOdd(-1, 100));
		System.out.println(sumOdd(100, 100));
		System.out.println(sumOdd(13, 13));
		System.out.println(sumOdd(100, -100));
		System.out.println(sumOdd(100, 1000));

	}
	
	public static boolean isOdd(int num) {
		boolean status = false;
		if(num < 0)
			return status;
		if(num % 2 ==1)
			status = true;
		return status;
	}
	
	public static int sumOdd(int start,int end) {
		int sum = 0;
		if(start > end) 
			return -1;
		if(start < 0 || end < 0) 
			return -1;
		for(int i=start;i<=end;i++) {
			if(isOdd(i))
					sum+=i;
		}
		return sum;
	}

}
