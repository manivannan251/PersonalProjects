package section5_coding_exercise;

public class PrintNumberInWordDemo {

	public static void main(String[] args) {
		printNumberInWord(8);
		printNumberInWord(0);
		printNumberInWord(-8);
		printNumberInWord(4);

	}
	
	public static void printNumberInWord(int number) {
		String word = "";
		switch(number) {
		case 0:
			   word = word+"ZERO";
			   break;
		case 1:
			   word = word+"ONE";
			   break;
		case 2:
			   word = word+"TWO";
			   break;
		case 3:
			   word = word+"THREE";
			   break;
		case 4:
			   word = word+"FOUR";
			   break;
		case 5:
			   word = word+"FIVE";
			   break;
		case 6:
			   word = word+"SIX";
			   break;
		case 7:
			   word = word+"SEVEN";
			   break;
		case 8:
			   word = word+"EIGHT";
			   break;
		case 9:
			   word = word+"NINE";
			   break;
		default:
				word = word+"OTHER";
		}
		System.out.println(word);
	}

}
