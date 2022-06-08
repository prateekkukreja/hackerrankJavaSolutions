package MultiThreading;

public class MultiThreading {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            //With Thread Class
//            MultiThreadingWithThread test = new MultiThreadingWithThread(i);
//            test.start();


            System.out.println("#############################***********#####################");
            // With Runnable class
            MultiThreadingWithRunnable testRun = new MultiThreadingWithRunnable(i);
            Thread t = new Thread(testRun);
            t.start();
        }
    }
}
