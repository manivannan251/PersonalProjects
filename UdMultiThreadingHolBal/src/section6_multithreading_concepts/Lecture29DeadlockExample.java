package section6_multithreading_concepts;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lecture29DeadlockExample {

    private Lock lock1 = new ReentrantLock();

    private Lock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        Lecture29DeadlockExample deadlock = new Lecture29DeadlockExample();
        new Thread(deadlock::worker1).start();
        new Thread(deadlock::worker2).start();
    }

    public void worker1() {
        lock1.lock();
        System.out.println("Acquired first lock");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        lock2.lock();
        System.out.println("Acquired second lock");
        lock1.unlock();
        lock2.unlock();

    }

    public void worker2() {
        lock2.lock();
        System.out.println("Acquired second lock");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        lock1.lock();
        System.out.println("Acquired first lock");
        lock1.unlock();
        lock2.unlock();

    }
}
