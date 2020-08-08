package section4_coding_exercise;

public class MinutesToYearsAndDaysCalculator {

	public static void main(String[] args) {
		printYearsAndDays(525600);
		printYearsAndDays(1051200);

		printYearsAndDays(561600);  //→ should print "561600 min = 1 y and 25 d"

	}
	
	
	public static void printYearsAndDays(long minutes) {
		if(minutes < 0) 
			System.out.println("Invalid Value");
		long daysCal = 60 * 24 ;
		long yearCal = daysCal * 365;
		long years = minutes / yearCal;
		long minBal = minutes % yearCal;
		long days = minBal / daysCal;		
		System.out.println(minutes+" min = "+years+" y and "+days+" d");
		
	}

}
