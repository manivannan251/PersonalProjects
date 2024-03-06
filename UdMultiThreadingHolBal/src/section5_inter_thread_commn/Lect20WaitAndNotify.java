package section5_inter_thread_commn;

public class Lect20WaitAndNotify {

    public static void main(String[] args) {
        ProdAndConsumerProcess process = new ProdAndConsumerProcess();
        Thread t1 = new Thread(
                ()->{
                    try {
                        process.produce();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        );

        Thread t2 = new Thread(
                ()->{
                    try {
                        process.consume();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        );
        Thread t3 = new Thread(
                ()->{
                    try {
                        process.consume2();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        );
        t1.start();
        t2.start();
        t3.start();
    }
}
class ProdAndConsumerProcess {

    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Starting the produce method");
            wait();
            System.out.println("Again in produce method");
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(1000);
        synchronized (this) {
            System.out.println("Inside the consume method");
            notifyAll();
            Thread.sleep(5000);
            System.out.println("Slept for 5 secs");

        }
    }

    public void consume2() throws InterruptedException {
        Thread.sleep(2000);
        synchronized (this) {
            System.out.println("Inside the consume2 method");
            Thread.sleep(5000);
            System.out.println("Slept for 5 secs");
            notify();
        }
    }

}
