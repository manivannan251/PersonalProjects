package com.edu.cjc;

public class FibDemo {

	public static String test(int n) {
		String fib="";
		int initial = 0;
		int first = 1;
		for(int i=0;i<n;i++) {
			
			fib = fib+String.valueOf(initial)+" ";
			int temp = first;
			first = initial+first;
			initial = temp;
			
		}
		
		return fib;
	}
	
	public static void main(String[] args) {
		System.out.println(test(6));

	}

}
