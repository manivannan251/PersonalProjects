package function_examples;

import java.util.Scanner;
import java.util.function.Function;

public class RemoveSpacesDemo {

	public static void main(String[] args) {
		System.out.println("Enter a string ");
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();		
		Function<String,String> removeSpaces = s->s.replaceAll(" ", "");
		System.out.println(removeSpaces.apply(inp));

	}

}
