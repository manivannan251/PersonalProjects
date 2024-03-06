package section5_inter_thread_commn;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ReentrantLockCondition {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void prodcuer() throws InterruptedException {
        lock.lock();
        System.out.println("Insdide producer method ..");
        condition.await();
        System.out.println("Again inside prodcuer method");
        lock.unlock();
    }

    public void consumer() throws InterruptedException {
        Thread.sleep(2000);
        lock.lock();
        System.out.println("Inside consumer method ");
        Thread.sleep(3000);
        condition.signal();
        lock.unlock();
    }
}
public class Lect24RentrantLockCondition {

    public static void main(String[] args) {
        ReentrantLockCondition rc = new ReentrantLockCondition();
        Thread t1 = new Thread(()->{
            try {
                rc.prodcuer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2 = new Thread(()->{
            try {
                rc.consumer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
