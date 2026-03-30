package MultiThreadingTwo;
public class Thread1 extends Thread{
    public void run(){
        for(int i=1;i<=10;i+=2){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
