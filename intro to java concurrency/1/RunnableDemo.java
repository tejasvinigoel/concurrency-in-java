public class RunnableDemo implements Runnable {
    private String threadName;

    public RunnableDemo(String name) {
        threadName = name;
    }

    public void run() {
        System.out.println("Running " + threadName);
    }
}