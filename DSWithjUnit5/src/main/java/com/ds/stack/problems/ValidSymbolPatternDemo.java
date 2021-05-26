package com.ds.stack.problems;

import com.ds.stack.StackUsingLL;

public class ValidSymbolPatternDemo {

	public static boolean isValidSymbolPattern(String s) {
		
		StackUsingLL<String> stack = new StackUsingLL<String>();
		for(int i=0;i<s.length();i++) {
			char temp = s.charAt(i);
			switch(temp) {
			case '{':
						stack.push(String.valueOf(temp));
						break;
			case '(':
						stack.push(String.valueOf(temp));
						break;
			case '[':
						stack.push(String.valueOf(temp));
						break;
			case '}':
						if(stack.peek().equals("{"))
							stack.pop();
						break;
			case ']':
						if(stack.peek().equals("["))
							stack.pop();
						break;
			case ')':
						if(stack.peek().equals("("))							
						stack.pop();						
						break;
			default:
						continue;
			}
		}
		return stack.isEmpty();
	}

}
