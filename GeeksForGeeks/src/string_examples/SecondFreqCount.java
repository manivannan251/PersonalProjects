package string_examples;

public class SecondFreqCount {

	public static char SecondFreqChar(String str) {
		int[] count = new int[128];
		for(int i=0;i<str.length();i++)
			count[str.charAt(i)]++;
		int fir=0,sec=0;		
		for(int i=0;i<128;i++) {
			if(count[i]==0)
				continue;
			if(count[i]>count[fir]) {
				
				sec = fir;
				fir = i;
			}
			else if(count[i]<count[fir] && count[i] > count[sec]) {
				sec = i;
			}
			
		}
		return (char) sec;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SecondFreqChar("aaabbc"));
		System.out.println(SecondFreqChar("zzbccc"));
		System.out.println(SecondFreqChar("abbbbbbbbbdddd"));
		

	}

}
