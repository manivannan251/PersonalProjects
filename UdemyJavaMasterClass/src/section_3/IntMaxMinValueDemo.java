package section_3;

public class IntMaxMinValueDemo {

	public static void main(String[] args) {
		int myMinValue = Integer.MIN_VALUE;
		int myMaxValue = Integer.MAX_VALUE;
		System.out.println("Intger Minimum Value "+myMinValue);
		System.out.println("Intger Maximum Value "+myMaxValue);
		System.out.println("Busted Max Value "+(myMaxValue+1));
		System.out.println("Busted Min Value "+(myMinValue+1));
		int value = 2_147_483_647;

	}

}
