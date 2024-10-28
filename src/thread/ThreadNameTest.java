package thread;

public class ThreadNameTest {
    public static void main(String[] args){
        Thread mainThread = Thread.currentThread(); //현재 실행 중인 스레드의 참조를 반환
        //메인 메서드에서 위의 코드를 호출하면 메인 스레드 반환
        System.out.println(mainThread.getName());

        for(int i=0;i<3;i++){
            Thread threadA = new Thread(){
                @Override
                public void run(){
                    System.out.println(getName()); //스레드의 이름을 리턴
                    //특별히 이름을 지정하지 않으면 자동으로 부여된다
                }
            };
            threadA.start();
        }

        Thread chatThread = new Thread(){
            @Override
            public void run(){
                System.out.println(getName());
            }
        };
        chatThread.setName("chatThread");
        chatThread.start();
//        Thread-3 >> chatThread 로 이름 변경
    }
}
