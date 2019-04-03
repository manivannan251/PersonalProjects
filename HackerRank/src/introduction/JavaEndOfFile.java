package introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaEndOfFile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List input  = new ArrayList();
		int i=1;
		while (sc.hasNext()) {
			input.add(sc.next());
			
			
		}
		for(Object inp : input) {
			System.out.println(i+ " "+inp);
			i++;
		}

	}

}
