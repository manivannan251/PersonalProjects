package demo.programs;

import java.util.Scanner;

class Runner extends Thread {
	private volatile boolean running = true;
	public void run() {
		while(running) {
			System.out.println("I am running");
		}
	}
	
	void stopRunning() {
		running = false;
	}
}
public class VolatileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner r = new Runner();
		r.start();
		Scanner in = new Scanner(System.in);
		in.nextLine();
		r.stopRunning();
		
	}

}
