package strings;

import java.util.Scanner;

public class StringTokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] arr = s.split("[\\s,'\\?!._@]+");
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++) {        	
        	System.out.println(arr[i]);
        }
        // Write your code here.
        scan.close();

	}

}
