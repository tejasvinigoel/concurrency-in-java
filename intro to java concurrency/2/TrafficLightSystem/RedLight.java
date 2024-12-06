public class RedLight implements Runnable{
    public void run(){
        try{
            System.out.println("Red Light ON");
            Thread.sleep(5000);
            System.out.println("Red Light OFF");
        }catch(InterruptedException e){
            System.out.println("Red Interrupted");
        }
    }
}