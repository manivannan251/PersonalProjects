package executors;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class OrderClient {

    public static void main(String[] args) throws InterruptedException {
        Executor executor = Executors.newFixedThreadPool(100);
        while(true) {
            Order order = OrderServer.getNextOrder();
            /*Thread t = new Thread(()->{
                try {
                    order.execute();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            t.start();*/
            executor.execute(()->{
                try {
                    order.execute();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }

    }
}
