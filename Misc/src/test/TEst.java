package test;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TEst implements Runnable {
	
	public static void main(String[] args) throws InterruptedException {
			String input1 = "while 23-10-1993 as 12-10-1993 as 11-12-2003";
			Pattern pattern = Pattern.compile("(\\d{2})-(\\d{2})-(\\d{4})");
			Matcher m = pattern.matcher(input1);
			Set<String> count = new HashSet<>();
			while(m.find()) {
				count.add(m.group(3));
			}
			System.out.println(count);
			System.out.println(count.size());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
