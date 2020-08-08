package section4_coding_exercise;

public class IsTeenDemo {

	public static void main(String[] args) {
		System.out.println(isTeen(13));
		System.out.println(isTeen(103));
		System.out.println(hasTeen(9, 99, 19));
		System.out.println(hasTeen(23, 15, 42));
		System.out.println(hasTeen(22, 23, 34));

	}
	
	public static boolean hasTeen(int a,int b,int c) {
		return isTeen(a) || isTeen(b) || isTeen(c) ? true : false;
	}
	
	public static boolean isTeen(int a) {
		
		return a>=13 && a <=19 ? true:false;
	}

}
