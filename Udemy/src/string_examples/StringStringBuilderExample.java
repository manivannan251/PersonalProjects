package string_examples;

public class StringStringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Mani");
		String s2 = s1.toString();
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		StringBuilder sb1 = new StringBuilder("Mani");
		StringBuilder sb2 = new StringBuilder("Mani");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		
		final StringBuilder s3= new StringBuilder("Mani");
		System.out.println(s3.capacity());
		
		
		

	}

}
