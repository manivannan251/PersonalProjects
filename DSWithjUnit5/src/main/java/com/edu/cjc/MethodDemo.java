package com.edu.cjc;

public class MethodDemo {

	public static void main(String[] args) {
		System.out.println(sumOfDig(3557));
		System.out.println(sumOfDig(62012));

	}
	
	public static String evenOddString(String x) {
		int len = x.length();
		return len%2==0?x.toUpperCase():x.toLowerCase();
	}
	
	public static int sumOfDig(int var) {
			int sum = 0;
			while(var/10>0) {
				sum = sum+var%10;
				var = var/10;
			}
	        // your code goes here
	        return sum+var; // return the resultant sum
	    }

	public static int checkSum(int one, int two) {
		// Write your code here
		// Declare the necessary variable

		// Change the return variable as well
		int sum = one + two;
		if (sum == 100)
			return 2;
		else if (sum > 100)
			return 1;
		else
			return 0;
		// return -1;
	}

	public static double letterToGPA(String grade) {
		double value = -1;
		switch (grade) {
		case "A+":
		case "A":
			value = 4;
			break;
		case "A-":
			value = 3.7;
			break;
		case "B+":
			value = 3.3;
			break;
		case "B":
			value = 3;
			break;
		case "B-":
			value = 2.8;
			break;
		case "C+":
			value = 2.5;
			break;
		case "C":
			value = 2;
			break;
		case "C-":
			value = 1.8;
			break;
		case "D":
			value = 1.5;
			break;
		case "F":
			value = 0;
			break;
		default:
			
		}
		return value;
	}

}
