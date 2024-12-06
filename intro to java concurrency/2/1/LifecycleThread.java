public class LifecycleThread extends Thread {
    public LifecycleThread(String name) {
        super(name); // Sets the thread name
    }

    @Override
    public void run() {
        try {
            System.out.println(getName() + " is starting.");
            Thread.sleep(1000); // Puts the thread in TIMED_WAITING state
            System.out.println(getName() + " is resuming.");
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted.");
        }
        System.out.println(getName() + " is finishing.");
    }
}