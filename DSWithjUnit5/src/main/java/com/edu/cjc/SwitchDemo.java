package com.edu.cjc;

public class SwitchDemo {

	public static String week_day(int x) {
        String answer = ""; 
        switch(x) {
        case 1:
        	answer="Monday";
        	break;
        case 2:
        	answer="Tuesday";
        	break;
        case 3:
        	answer="Wednesday";
        	break;
        case 4:
        	answer="Thursday";
        	break;
        case 5:
        	answer="Friday";
        	break;
        case 6:
        	answer="Saturday";
        	break;
        case 7:
        	answer="Sunday";
        	break;
        default:
        	answer="invalid input";
        }
        // Enter your code here
        // Store your final result in the variable answer
        
        /* You do not need to worry too much about the return statement for the 
        moment and just set the value of answer correctly*/

        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
