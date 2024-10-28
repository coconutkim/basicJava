package thread;

//public class White extends Thread {
public class White implements Runnable{
//    public void whiteFlag(){

//        while(true) {
//            System.out.println("white flag");
//        }
//    }

    public void run() {
        while (true) {
            System.out.println("white flag");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}
