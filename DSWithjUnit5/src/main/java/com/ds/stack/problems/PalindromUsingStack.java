package com.ds.stack.problems;

import com.ds.stack.StackUsingLL;

public class PalindromUsingStack {
	
	
	public static boolean isPalindrome(String str) {
		boolean test = true;
		StackUsingLL<String> stack = new StackUsingLL<String>();
		
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i)>=65&&str.charAt(i)<=90)||
					(str.charAt(i)>=97&&str.charAt(i)<=122))
			stack.push(String.valueOf(str.charAt(i)));
			
		}
		
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i)>=65&&str.charAt(i)<=90)||
					(str.charAt(i)>=97&&str.charAt(i)<=122)) {
			String temp = stack.pop();
			if(!(temp.equalsIgnoreCase(String.valueOf(str.charAt(i))))) {
				test = false;
				break;
			}
			}
			
		}
		return test;
	}
}
