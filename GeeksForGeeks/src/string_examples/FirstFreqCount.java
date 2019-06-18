package string_examples;

public class FirstFreqCount {

	public static char firstFreqCount(String str) {
		int[] count = new int[128];
		if(str.length()==0)
			return ' ';
		int fir = 0;
		for(int i=0;i<str.length();i++)
			count[str.charAt(i)]++;
		for(int i=0;i<128;i++) {
			if(count[i]==0)
				continue;
			if(count[i]>count[fir]) {
				fir = i;
			}
		}
		return (char) fir;
	}
	
	public static void main(String[] args) {
		
		System.out.println(firstFreqCount("rrrrr"));
		System.out.println(firstFreqCount("zzbccc"));
		System.out.println(firstFreqCount("abbbbbbbbbdddd"));

	}

}
