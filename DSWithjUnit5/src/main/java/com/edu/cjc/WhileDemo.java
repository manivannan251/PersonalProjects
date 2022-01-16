package com.edu.cjc;

public class WhileDemo {

	public static String test(int num) {
        String answer = "";
        int multiplier = 1;
        while(multiplier<=10) {
        	answer = answer+" "+String.valueOf(num*multiplier);
        	multiplier++;
        }
        // Enter your code here
        // Store your final result in the variable answer
        
        /* You do not need to worry too much about the return statement for the 
        moment and just set the value of “answer” correctly*/

        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(test(5));

	}

}
