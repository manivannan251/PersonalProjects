package section2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutors {

	public static void main(String[] args) {
		System.out.println("Main thread starts here");
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		for(int i=0;i<3;i++) {
			executorService.submit(new LoopTaskA());
		}
		
		executorService.shutdown();
		
		System.out.println("Main thread ends here");

	}

}
