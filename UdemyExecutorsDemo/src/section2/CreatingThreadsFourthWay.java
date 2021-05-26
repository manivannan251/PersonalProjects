package section2;

public class CreatingThreadsFourthWay {

	public static void main(String[] args) {
		System.out.println("Main thread starts here!!!");
		new Thread(new LoopTaskA()).start();
		Thread t = new Thread(new LoopTaskA());
		t.start();
		System.out.println("Main thread ends here");

	}

}
