package thread;

public class FlagTest {
    public static void main(String[] args){
        White white = new White();
        Blue blue = new Blue();

//        white.whiteFlag();
//        blue.blueFlag();

        //////////////////////////////스레드의 객체 생성
        Thread t1 = new Thread(white); //이렇게 해야 비로소 스레드가 된다
        Thread t2 = new Thread(blue);

//        white.start();
//        blue.start();
        //스레드이기에 메인과 관계가 없다

//        Thread 클래스를 상속받아 run() 메서드를 오버라이드하는 방법
//        이 경우에는 new MyThread()와 같이 생성 후
//        바로 start() 메서드를 호출하여 스레드를 시작할 수 있습니다.

        t1.start(); //run 메소드를 호출
        t2.start();

        System.out.println("the name of currently executing thread: "+Thread.currentThread().getName());
        System.out.println("스레드의 최소 우선 순위 값: "+Thread.MIN_PRIORITY);
        System.out.println("스레드의 최대 우선순위 값: "+Thread.MAX_PRIORITY);
        System.out.println("스레드의 중간 우선순위 값: "+Thread.NORM_PRIORITY);
        System.out.println("현재 수행되는 스레드의 우선 순위: "+Thread.currentThread().getPriority());
    }
}
