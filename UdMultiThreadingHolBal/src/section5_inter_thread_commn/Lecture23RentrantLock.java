package section5_inter_thread_commn;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lecture23RentrantLock {

    private static int counter = 0;

    private static Lock lock = new ReentrantLock();

    public static void increment() {
        lock.lock();
        try {
            for(int i=0;i<10000;i++) {
                counter++;
            }
        } finally {
            lock.unlock();
        }

    }
    public static void main(String[] args) {
        Thread t1 = new Thread(Lecture23RentrantLock::increment);
        Thread t2 = new Thread(Lecture23RentrantLock::increment);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("The value of counter is "+counter);
    }
}
