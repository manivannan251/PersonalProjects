package section5_inter_thread_commn;

import java.util.ArrayList;
import java.util.List;

class ProducerConsumer {
    private List<Integer> list = new ArrayList<>();
    private int UPPER_LIMIT = 5;

    private int LOWER_LIMIT = 0;

    private final Object lock = new Object();

    private int value = 1;

    public void producer() throws InterruptedException {
        synchronized (lock) {
            while (true) {
                if(list.size()==UPPER_LIMIT) {
                    System.out.println("Waiting for consumer to remove items");
                    lock.wait();
                } else {
                    System.out.println("Adding items to list: " +value);
                    list.add(value++);

                    lock.notify();
                }
                Thread.sleep(500);
            }
        }
    }

    public void consumer() throws InterruptedException {
        synchronized (lock) {
            while (true) {
                if(list.size()==LOWER_LIMIT) {
                    System.out.println("Waiting for producer to add items");
                    lock.wait();
                } else {
                    value = list.size();
                    System.out.println("Removing items from list "+value);
                    list.remove(value-1);
                    lock.notify();

                }
                Thread.sleep(500);
            }
        }
    }
}
public class Lect22ProducerConsumer {

    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();
        Thread t1 = new Thread(()->{
            try {
                pc.producer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2 = new Thread(()->{
            try {
                pc.consumer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();
    }
}
