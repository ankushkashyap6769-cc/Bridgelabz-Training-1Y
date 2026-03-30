package Multi_Threading;

public class MyThread2 implements Runnable{
    public void run(){
        for(int i=5;i>=0;i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
