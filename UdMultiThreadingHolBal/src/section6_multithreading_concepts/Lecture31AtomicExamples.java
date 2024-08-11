package section6_multithreading_concepts;

import java.util.concurrent.atomic.AtomicInteger;

public class Lecture31AtomicExamples {

    //private static int counter = 0;
    private static AtomicInteger counter = new AtomicInteger(0);

    private static void increment() {
        for(int i=0;i<10000;i++)
            //counter++;
            counter.getAndIncrement();
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            Lecture31AtomicExamples.increment();
        });
        Thread t2 = new Thread(()->{
            Lecture31AtomicExamples.increment();
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("The counter value is "+counter);
    }
}
