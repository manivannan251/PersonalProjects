package section5_inter_thread_commn;

import java.util.stream.IntStream;

public class Lect16Synchronisation {

    public static int counter = 0;

    public synchronized static void increment() {
        IntStream.range(0,100).forEach((i)-> {
                    counter++;
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

        );
    }

    public static void process() throws InterruptedException {
        Thread t1 = new Thread(Lect16Synchronisation::increment);
        Thread t2 = new Thread(Lect16Synchronisation::increment);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("The counter value is "+counter);
    }

    public static void main(String[] args) throws InterruptedException {
        process();
    }
}
