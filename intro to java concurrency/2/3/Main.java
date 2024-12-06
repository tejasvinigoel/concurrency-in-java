public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new RunnableDemo("Thread-1"));
        Thread t2 = new Thread(new RunnableDemo("Thread-2"));

        System.out.println(t1.getState());
        System.out.println(t2.getState());
        t1.start();
        t2.start();
         for(int i=0;i<10;i++){
            try{
            System.out.println(t1.getState()+" "+t2.getState());
            Thread.sleep(250);
            System.out.println("Main woke up");
            }catch (InterruptedException e){
                System.out.println("Interrupted ");
            }
        }
        t1.join();
        t2.join();

        System.out.println(t1.getState());
        System.out.println(t2.getState());
        
    }
}