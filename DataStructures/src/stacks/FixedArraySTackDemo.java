package stacks;

public class FixedArraySTackDemo {

	public static void main(String[] args) throws Exception {
		UserStackFArray<Integer> us = new UserStackFArray<Integer>();
		System.out.println(us.isEmpty());
		us.push(2);
		us.push(4);
		System.out.println("The size of the stack is "+us.size());
		System.out.println("The top element is "+us.top());
		System.out.println(us);
		System.out.println(us.isEmpty());

	}

}
