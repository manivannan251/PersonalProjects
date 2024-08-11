package executors;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class ThreadPoolExecutorDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor
                = new ThreadPoolExecutor(1,5,1, TimeUnit.MINUTES,new LinkedBlockingDeque<>(3),new ThreadPoolExecutor.AbortPolicy());
        try {
            IntStream.range(0,6)
                    .forEach(i->{
                        threadPoolExecutor.submit(()->{
                            System.out.println("This is a worker thread: "+Thread.currentThread());
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        });
                    });
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
