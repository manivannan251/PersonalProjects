package introduction;

import java.util.Calendar;
import java.util.Scanner;

class CalendarSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        Calendar cal = Calendar.getInstance();
        cal.set(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
        
        

	}

}
