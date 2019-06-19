package strings;

public class IsPermOfPalin {

	public static boolean isPermOfPalin(String str) {
		if(str.length()==0) 
			return false;
		int counter =0;
		int[] count = new int[128];
		for(int i=0;i<str.length();i++)
			count[str.charAt(i)]++;
		for(int i=0;i<128;i++) {
			if(count[i]==0)
				continue;
			if(count[i]%2!=0)
				counter++;
		}
		return counter==1;
	}
	
	
	public static void main(String[] args) {
		System.out.println(isPermOfPalin("tactcoa"));
		System.out.println(isPermOfPalin("abc"));
		System.out.println(isPermOfPalin("abccb"));

	}

}
