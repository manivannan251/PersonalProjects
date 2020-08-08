//Coding Exercise 1
package section4_coding_exercise;



public class SppedConverter {

	public static void main(String[] args) {
		printConversion((1.5));
		printConversion(10.25);
		printConversion(-5.6);
		printConversion(25.42);
		printConversion(75.114);

	}
	
	
	public static long toMilesPerHour(double kilometersPerHour) {
		if (kilometersPerHour < 0)
			return -1;
		double milesperHour = kilometersPerHour / 1.609 ;
		long result = Math.round(milesperHour);
		return result;
	}
	
	public static void printConversion(double kilometersPerHour) {
		if(kilometersPerHour < 0) {
			System.out.println("Invalid Value");
		}
		else {
			long milesPerhour = toMilesPerHour(kilometersPerHour);
			System.out.println(kilometersPerHour+" km/h = "+milesPerhour+" mi/h");
		}
			
		
	}

}
