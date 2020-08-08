package section4_coding_exercise;

public class BarkingDogDemo {

	public static void main(String[] args) {
		System.out.println(shouldWakeUp (true, 1));
		System.out.println(shouldWakeUp (false, 2));
		System.out.println(shouldWakeUp (true, 8));
		System.out.println(shouldWakeUp (true, -1));
		
	}
	
	public static boolean shouldWakeUp(boolean barking,int hourOfDay) {
		boolean status = false;
		if(hourOfDay < 0 || hourOfDay > 23)
			return status;
		if(barking && (hourOfDay < 8 || hourOfDay >22)) 
			status=true;
		return status;
	}

}
