package thread;

//public class Blue extends Thread {
//하나의 클래스만 상속이 가능
public class Blue implements Runnable{
    //implements를 사용하면 다중 인터페이스 구현이 가능 >> 유연한 설계
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
