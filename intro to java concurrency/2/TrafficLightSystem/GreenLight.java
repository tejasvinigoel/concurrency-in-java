public class GreenLight implements Runnable{
    public void run(){
        try{
            System.out.println("Green Light ON");
            Thread.sleep(4000);
            System.out.println("Green Light OFF");
        }catch(InterruptedException e){
            System.out.println("Green Interrupted");
        }
    }
}