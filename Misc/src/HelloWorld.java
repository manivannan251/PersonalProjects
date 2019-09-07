import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.common.base.Joiner;

//import org.apache.commons.lang.StringEscapeUtils;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		//Scanner in = new Scanner(System.in);
		//String name = in.next();
		//System.out.println("Hello "+name);
		/*String strHTMLInput = "<p>MyName<p>";
        String strEscapeHTML = StringEscapeUtils.escapeHtml(strHTMLInput);
        String strUnEscapeHTML = StringEscapeUtils.unescapeHtml(strEscapeHTML);
        System.out.println("Escaped HTML >>> " + strEscapeHTML);
        System.out.println("UnEscaped HTML >>> " + strUnEscapeHTML);*/
		Joiner joiner = Joiner.on("; ").skipNulls();
		System.out.println(joiner.join("Harry", null,"Ron", "Hermonies"));
		
	}

}
