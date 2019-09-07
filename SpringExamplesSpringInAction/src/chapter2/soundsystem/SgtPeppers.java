package chapter2.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {
	
	private String title = "Paiyya";
	
	private String artist = "Yuvan";
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing "+title+" BY "+artist);
		
	}

}
