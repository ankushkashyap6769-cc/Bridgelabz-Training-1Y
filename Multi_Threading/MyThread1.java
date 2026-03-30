package Multi_Threading;

public class MyThread1 implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Ankush...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
