public class Main {
    public static void main(String[] args) {
        HelloThread thread = new HelloThread("HelloThread-1");
        thread.start(); // Calls the start method which internally invokes run()

        Thread t1 = new Thread(new RunnableDemo("Thread-1"));
        t1.start();
    }
}
