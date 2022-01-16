package com.edu.cjc;

public class ForDemo {

	public static void test(int rows) {
		for(int i=1;i<=rows;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		test(5);

	}

}
