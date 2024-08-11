import java.util.concurrent.Executor;

public class PlainExecutorDemo {

    public static void main(String[] args) {
        MyExecutor executor = new MyExecutor();
        MyWork work = new MyWork();
        executor.execute(work);
    }

    static class MyExecutor implements Executor {

        @Override
        public void execute(Runnable command) {
            Thread myThread = new Thread(command);
            myThread.start();
        }
    }

    static class MyWork implements Runnable {

        @Override
        public void run() {
            System.out.println("My Work is running now");
        }
    }
 }
