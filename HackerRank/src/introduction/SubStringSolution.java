package introduction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SubStringSolution {

	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        for(int i=0;i<=s.length()-k;i++) {
        	if(i==0) 
        		smallest=s.substring(i, k);
        	if(s.substring(i, k+i).compareTo(smallest)<0)
        		smallest=s.substring(i, k+i);
        	else if(s.substring(i, k+i).compareTo(largest)>0)
        		largest=s.substring(i, k+i);
        }
        // Complete the function
        // 'smallest' must be th	e lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();*/
      
        //System.out.println(getSmallestAndLargest(s, k));
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(2);
        al.add(2);
        System.out.println(Collections.frequency(al, 2));

	}

}
