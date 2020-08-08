package section5_coding_exercise;

public class NumberPalindromeDemo {

	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(-1221));
		System.out.println(isPalindrome(707));
		System.out.println(isPalindrome(11212));
		System.out.println(isPalindrome(101));
		System.out.println(isPalindrome(-222));

	}
	
	
	public static boolean isPalindrome(int number) {
		boolean status = false;
		int absNumber = Integer.valueOf(Math.abs(number));
		int comp = absNumber;
		if(absNumber<=10)
			return status;
		System.out.println("The actual number is "+absNumber);		
		int reversed = 0;
		while(absNumber>=10) {
			int temp = absNumber%10;
			reversed = reversed*10+temp;
			absNumber = absNumber/10;
		}
		reversed = reversed*10+absNumber;
		System.out.println("The number reversed is "+reversed);
		
		if(comp==reversed)
			status = true;
		return status;
	}

}
