public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread red=new Thread(new RedLight());
        Thread green=new Thread(new GreenLight());
        Thread yellow=new Thread(new YellowLight());
        
        red.start();
        red.join();
        
        green.start();
        green.join();
        
        yellow.start();
        yellow.join();
    }
}