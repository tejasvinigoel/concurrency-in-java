public class HelloThread extends Thread {
    public HelloThread(String name) {
        super(name); // Calls the constructor of the Thread class to set the thread name
    }

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public void start() {
        super.start(); // Calls the start method of the Thread class to initiate the run method
    }
}