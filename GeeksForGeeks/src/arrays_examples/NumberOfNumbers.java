package arrays_examples;

import java.util.Arrays;

/*Given an array A[]  of n elements. Your task is to complete the Function num which returns an integer denoting the total number of times digit k appears in the whole array.

For Example:

A[]={11,12,13,14,15}, k=1

Output=6 //Count of the digit 1 in the array
*/
public class NumberOfNumbers {

	public static void main(String[] args) {
		int[] a = {11,12,13,14,15,22};
		//System.out.println(checkDigits(14, 1));
		System.out.println(count(a, 2));

	}
	
	static long count(int num[],int k) {
		long count = 0;
		//count = Arrays.stream(num).map(s->checkDigits(s, k)).count();
		for(int a : num) {
			count = count+checkDigits(a, k);
		}
		return count;
	}
	
	static int checkDigits(int num,int k) {
		int count = 0;
		while(num>0) {
			int div = num%10;
			if(div==k)
				count++;
			num = num/10;
			
		}
		if(num%10==k)
			count++;
		return count;
	}

}
