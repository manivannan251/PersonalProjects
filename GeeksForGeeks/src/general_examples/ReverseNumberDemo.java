package general_examples;

public class ReverseNumberDemo {

	public static int reverseNo(int no) {
		int revno = 0;
		boolean neg = false;
		if(no < 0) {
			no = no * -1;
			neg = true;
		}		
			
		while(no>0) {
			revno = revno*10 + no%10;
			no = no/10;
		}
		
		return neg==false?revno:revno*-1;
	}
	
	public static void main(String[] args) {
		System.out.println(reverseNo(123));
		System.out.println(reverseNo(1235));
		System.out.println(reverseNo(6123));
		System.out.println(reverseNo(-6123));

	}

}
