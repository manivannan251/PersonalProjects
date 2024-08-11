package section6_multithreading_concepts;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lecture30LiveLockExample {

    private Lock lock1 = new ReentrantLock(true);
    private Lock lock2 = new ReentrantLock(true);

    private void worker1() {
        while (true) {
            try {
                lock1.tryLock(50, TimeUnit.MILLISECONDS);
                System.out.println("Worker 1 acquires lock 1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker 1 tries to acquire lock 2");
            if(lock2.tryLock()) {
                System.out.println("Worker 1 acquires lock 2");
                lock2.unlock();
            } else {
                System.out.println("Worker 1 cannot acquire lock 2");
                continue;
            }
            break;
        }
        lock1.unlock();
        lock2.unlock();
    }

    private void worker2() {
        while (true) {
            try {
                lock2.tryLock(50, TimeUnit.MILLISECONDS);
                System.out.println("Worker 2 acquires lock 2");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker 2 tries to acquire lock 1");
            if(lock1.tryLock()) {
                System.out.println("Worker 2 acquires lock 1");
                lock1.unlock();
            } else {
                System.out.println("Worker 2 cannot acquire lock 1");
                continue;
            }
            break;
        }
        lock1.unlock();
        lock2.unlock();
    }

    public static void main(String[] args) {
        Lecture30LiveLockExample eg = new Lecture30LiveLockExample();
        new Thread(eg::worker1).start();
        new Thread(eg::worker2).start();
    }
}
