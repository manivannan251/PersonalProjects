package section4_coding_exercise;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalEqualityDemo {

	public static void main(String[] args) {
		System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
		System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
		System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
		System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
		System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.1757));

	}
	
	public static boolean areEqualByThreeDecimalPlaces(double a,double b) {
		boolean status = false;
		BigDecimal bd1 = new BigDecimal(String.valueOf(a));
		bd1 = bd1.setScale(3,RoundingMode.DOWN);
		//System.out.println("First Rounded Number "+bd1);
		BigDecimal bd2 = new BigDecimal(String.valueOf(b));
		bd2 = bd2.setScale(3,RoundingMode.DOWN);
		//System.out.println("Second Rounded Number "+bd2);
		if(bd1.compareTo(bd2)==0)
			status=true;
		
			
		return status; 
	}

}
