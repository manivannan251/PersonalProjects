package strings;

public class IsUniqueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isUnique("abcdefghijkl"));
		System.out.println(isUniqueWithBits("abca"));

	}
	
	public static boolean isUnique(String str) {
		if(str.length()>128) 
			return false;
		boolean[] check = new boolean[128];
		for(int i=0;i<str.length();i++) {
			
			if(check[str.charAt(i)])
				return false;
			check[str.charAt(i)]=true;
		}
		return true;
	}
	
	public static boolean isUniqueWithBits(String str) {
		int check=0;
		for(int i=0;i<str.length();i++) {
			int val = str.charAt(i) - 'a';
			if((check & (1<<val)) > 0)
				return false;
			check = check | 1<<val;
		}
		return true;
	}

}
