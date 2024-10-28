package thread;

//public class Blue extends Thread {
public class Blue implements Runnable{
//    public void blueFlag(){
//        while (true) {
//            System.out.println("blue flag");
//        }
//    }

    public void run(){
        while (true) {
            System.out.println("blue flag");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}
        }
    }
}
