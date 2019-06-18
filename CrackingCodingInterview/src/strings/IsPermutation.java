package strings;

public class IsPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPermutation("god", "gdo"));
		System.out.println(isPermutation("uio", "gdo"));
		System.out.println(isPermutation("ate", "tea"));
		System.out.println(isPermutation("bye", "hi"));	

	}
	
	public static boolean isPermutation(String s1,String s2) {
		int[] ch = new int[128];
		if(s1.length()!=s2.length())
			return false;
		for(int i=0;i<s1.length();i++) 
			ch[s1.charAt(i)]++;
		for(int j=0;j<s2.length();j++) {
			
			ch[s2.charAt(j)]--;
			if(ch[s2.charAt(j)]<0)
				return false;
		
		}
		return true;
	}

}
