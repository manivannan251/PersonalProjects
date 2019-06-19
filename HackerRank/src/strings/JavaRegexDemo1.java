package strings;

import java.util.Scanner;

public class JavaRegexDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            
            System.out.println(IP.matches(new MyRegex().pattern));
        }


	}

}
class MyRegex {
	
	//public String pattern="([0-2][0-9][0-9]\\.){3}[0-2][0-9][0-9]";
	public String pattern="\\b(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.\r\n" + 
			"(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.\r\n" + 
			"(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.\r\n" + 
			"(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\b";
}
