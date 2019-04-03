package strings;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AnagramSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

	}
	
	static boolean isAnagram(String a, String b) {
        Map<Character,Integer> an = new TreeMap<>();
        a=a.toLowerCase();
        b=b.toLowerCase();
        boolean isA = true;
        //int[] ch = new int[150];
        
        for(int i=0;i<a.length();i++) {
        	//ch[a.charAt(i)]=ch[a.charAt(i)]+1;
        	if(an.containsKey(a.charAt(i)))
        		an.put(a.charAt(i), an.get(a.charAt(i))+1);
        	else
        		an.put(a.charAt(i), 1);
        }
        for(int i=0;i<b.length();i++) {
        	//ch[a.charAt(i)]=ch[a.charAt(i)]+1;
        	if(an.containsKey(b.charAt(i)))
        		an.put(b.charAt(i), an.get(b.charAt(i))-1);
        	else
        		//an.put(String.valueOf(a.charAt(i)), 1);
        		return false;
        }
        List<Integer> val = new ArrayList<>(an.values());
       // ArrayList<Integer> val = (ArrayList<Integer>) an.values();
        for(int i=0;i<val.size();i++) {
        	if(val.get(i)!=0)
        		return false;
        }
		return isA;
    }

}
