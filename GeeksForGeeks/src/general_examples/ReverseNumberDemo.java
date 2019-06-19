package general_examples;

public class ReverseNumberDemo {

	public static int reverseNo(int no) {
		int revno = 0;
		while(no>0) {
			revno = revno*10 + no%10;
			no = no/10;
		}
		return revno;
	}
	
	public static void main(String[] args) {
		System.out.println(reverseNo(123));
		System.out.println(reverseNo(1235));
		System.out.println(reverseNo(6123));

	}

}
