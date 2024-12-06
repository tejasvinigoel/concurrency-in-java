public class RunnableDemo implements Runnable  {
    private String threadName;

    public RunnableDemo(String name) {
        threadName = name;
    }
    // TODO: Implement the run() method:
    // - Print a message indicating the start of thread execution.
    // - Simulate some work by using Thread.sleep().
    // - Print a message indicating the end of thread execution.
    public void run() {
        // TODO: Add code here to simulate some work, e.g., using Thread.sleep()
        
        try{
            System.out.println("Running "+threadName);
            Thread.sleep(1000);
            System.out.println(threadName+" woke up");
        }catch (InterruptedException e){
            System.out.println("Interrupted "+threadName);
        }
        System.out.println("Ending "+threadName);
    }
}