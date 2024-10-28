package thread;

public class YieldTest {
    public static void main(String[] args){
//        public WorkThread(String name)
        WorkThread whA = new WorkThread("workThreadA");
        WorkThread whB = new WorkThread("workThreadB");
        whA.start();
        whB.start();

        try{Thread.sleep(5000);}catch (InterruptedException e){}
        whA.work = false;

        try{Thread.sleep(10000);}catch (InterruptedException e){}
        whA.work = true;

        //처음 5초: 1번과 2번이 번갈아 가며 실행
        //10초 전까지: 1번을 false을 변경함으로 2번이 더 많은 실행 기회를 얻음
        //10초 뒤: 다시 번갈하가며 실행
    }
}
