package MultiThreadingTwo;

public class Thread2 extends Thread{
    public void start(){
        for(int i=2;i<=10;i+=2){
            System.out.println(i);
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
