package com.edu.cjc;

public class ArrDemo {

	public static void main(String[] args) {
		//printMat(3);
		printPascalTri(4);

	}
	
	
	public static <T extends Comparable<T>>  T array_max(T data[], int n) {
        T max = data[0];
        for(int i=1;i<n;i++) {
            if(data[i].compareTo(max)<0)
                max = data[i];
        }
        //body of code
        return max;
    }

	
	public static void printPascalTri(int size) {
		int[][] arr = new int[size][size];
		for(int i=0;i<size;i++) {
			for(int j=0;j<=i;j++) {
				if(i==0||i==1)
					arr[i][j]=1;
				if(j==0||j==i)
					arr[i][j]=1;
				else
				{
					arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
				}
			}
		}
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void printMat(int n) {
        //write the codefor making and printing the matrix here
        //use can use \n to move numers to next line in the matrix
        //use " " to add space between numbers in matrix
        System.out.println(); //comment out this line when you start writing code
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		if(i==j)
        			System.out.print(0+" ");
        		else if(j>i)
        			System.out.print(1+" ");
        		else
        			System.out.print(-1+" ");
        	}
        	System.out.println();
        }
    }

}
