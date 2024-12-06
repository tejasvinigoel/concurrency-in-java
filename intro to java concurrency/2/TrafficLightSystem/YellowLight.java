public class YellowLight implements Runnable{
    public void run(){
        try{
            System.out.println("Yellow Light ON");
            Thread.sleep(2000);
            System.out.println("Yellow Light OFF");
        }catch(InterruptedException e){
            System.out.println("Yellow Interrupted");
        }
    }
}