package section6_multithreading_concepts;
class VolatileStatus {

    private static volatile boolean terminated;

    public static boolean isTerminated() {
        return terminated;
    }

    public static void setTerminated(boolean terminated) {
        VolatileStatus.terminated = terminated;
    }
}
class VolatileWorker implements Runnable{

    @Override
    public void run() {
        while(!VolatileStatus.isTerminated()) {
            System.out.println("Running VolatileWorker "+Thread.currentThread());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Lecture16VolatileDemo {

    public static void main(String[] args) throws InterruptedException {
        VolatileWorker vw = new VolatileWorker();
        Thread t1 = new Thread(vw);
        Thread t2 = new Thread(vw);
        t1.start();
        t2.start();
        Thread.sleep(3000);
        VolatileStatus.setTerminated(true);
        System.out.println("Terminating Main Thread");
    }


}
