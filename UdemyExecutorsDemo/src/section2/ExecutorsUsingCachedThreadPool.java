package section2;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExecutorsUsingCachedThreadPool {

	public static void main(String[] args) {
		System.out.println("Main thread starts here");
		
		ExecutorService execService = Executors.newCachedThreadPool();
		
		for(int i=0;i<6;i++) {
			execService.submit(new LoopTaskA());
		}
		
		execService.shutdown();
		
		System.out.println("Main thread ends here");
			
			
	}

}
