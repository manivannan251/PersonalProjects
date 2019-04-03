package arrays_examples;

import java.util.Scanner;

public class CountZeroes {

	public static void zeroCount(String[] li) {
		int counter=0;
		for(int i=0;i<li.length;i++) {
			if(li[i].contains("0"))
				counter++;
			
		}
		System.out.println("The number of zeroes "+counter);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of test cases");
		int tcount = sc.nextInt();
		for(int i=0;i<tcount;i++) {
			int len = sc.nextInt();
			String[] str = new String[len];
			for(int j=0;j<len;j++) {
				str[j]=sc.next();
				
			}
			zeroCount(str);
			
			
			
		}

	}

}
