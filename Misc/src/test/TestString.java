package test;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestString {

	public static void main(String[] args) {
		String inp1 = "i was botn on 12-10-1945 with 12-10-1945 and the 11-10-1245";
		Pattern p = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");
		Matcher m = p.matcher(inp1);
		Set<String> count = new HashSet<>();
		while(m.find()) {
			count.add(m.group());
		}
		System.out.println("The unique date values are "+count.size());
	}

}
