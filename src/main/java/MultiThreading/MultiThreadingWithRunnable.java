package MultiThreading;

public class MultiThreadingWithRunnable implements Runnable {

    private int threadNumber;
    public MultiThreadingWithRunnable(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " from thread " + threadNumber);
//            if (threadNumber == 3){
//                throw new RuntimeException();
//            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
