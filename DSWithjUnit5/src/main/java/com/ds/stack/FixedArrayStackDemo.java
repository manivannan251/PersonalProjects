package com.ds.stack;

public class FixedArrayStackDemo {

	public static void main(String[] args) throws Exception {
		FixedArrayStack<Integer> us = new FixedArrayStack<>();
		System.out.println(us.isEmpty());
		us.push(2);
		us.push(4);
		System.out.println("The size of the stack is "+us.size());
		System.out.println("The top element is "+us.top());
		System.out.println(us);
		System.out.println(us.isEmpty());

	}

}
