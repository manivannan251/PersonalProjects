public class JoiningThreadsDemo {

    public static void main(String[] args) throws InterruptedException {
        ExecuteMe executeMe = new ExecuteMe();
        Thread innerThread = new Thread(new ExecuteMe());
        innerThread.start();
        innerThread.join();
        System.out.println("Main thread exiting");
    }


}

class ExecuteMe implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("Say hello and hello over again");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {

            }
        }
    }
}
