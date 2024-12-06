public class Main {
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread("High Priority Thread");
        PriorityThread t2 = new PriorityThread("Low Priority Thread");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }
}

class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + ": Message " + i);
        }
    }
}
