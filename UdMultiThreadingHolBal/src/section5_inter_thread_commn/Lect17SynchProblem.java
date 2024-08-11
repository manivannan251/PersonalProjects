package section5_inter_thread_commn;

import java.util.function.Consumer;
import java.util.stream.IntStream;

public class Lect17SynchProblem {

    public static int counter1 = 0;

    public static int counter2 = 0;

    private static Object lock1 = new Object();

    private static Object lock2 = new Object();

    public static void increment1() {
        synchronized (lock1) {
            IntStream.range(0, 100).forEach((i) -> {
                        counter1++;
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }

            );
        }
    }

    public static void increment2() {
        synchronized (lock2) {
            IntStream.range(0, 100).forEach((i) -> {
                        counter2++;
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }

            );
        }
    }

    public static void process() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread t1 = new Thread(Lect17SynchProblem::increment1);
        Thread t2 = new Thread(Lect17SynchProblem::increment2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("The counter 1 value is "+counter1);
        System.out.println("The counter 2 value is "+counter1);
        long end = System.currentTimeMillis();
        System.out.println("Time taken to complete the program is "+(end-start)/1000);
    }

    public static void main(String[] args) throws InterruptedException {
        process();
    }
}
