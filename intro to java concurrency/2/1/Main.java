public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new LifecycleThread("Thread-1");
        Thread t2 = new LifecycleThread("Thread-2");

        t1.start();
        t1.join(); // Main thread waits for t1 to finish before starting t2
        t2.start();
    }
}