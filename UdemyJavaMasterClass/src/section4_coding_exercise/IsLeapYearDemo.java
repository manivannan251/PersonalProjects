package section4_coding_exercise;

public class IsLeapYearDemo {

	public static void main(String[] args) {
		System.out.println(isLeapYear(-1600));
		System.out.println(isLeapYear(1600));
		System.out.println(isLeapYear(2017));
		System.out.println(isLeapYear(2000));
		System.out.println(isLeapYear(1924));

	}
	
	public static boolean isLeapYear(int year) {
		boolean status = false;
		if(year < 1000 || year > 9999)
			return status;
		if(year % 4==0) {
			if(year%100!=0) {
				status=true;
			} else {
				if(year%400==0)
					status=true;
			}
		} else {
			return status;
		}
		return status;
	}

}
