package thread;

public class BeepPrintTest {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i <= 5; i++) {
                    System.out.println("thread");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        });
//        thread.start(); //run 메소드를 호출

//        for(int i=0;i<=5;i++){
//            System.out.println("beep");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//        }
    }
}