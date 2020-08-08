package section2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsUsingFixedThreadPool {

	public static void main(String[] args) {
		
		System.out.println("Main Thread Starts here");
		
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		for(int i=0;i<6;i++) {
			executorService.submit(new LoopTaskA());
		}
		
		executorService.shutdown();
		
		//executorService.execute(new LoopTaskA());
		System.out.println("Main Thread Ends here");

	}

}
