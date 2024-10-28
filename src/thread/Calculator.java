package thread;

public class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    //synchronized method
    public synchronized void setMemory1(int memory){
        //단 하나의 스레드만 실행하는 영역
        this.memory = memory; //메모리 값을 저장하고
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){}
        System.out.println(Thread.currentThread().getName()+": "+this.memory); //메모리 값을 읽는다
    }

    //synchronized block
    public void setMemory2(int memory){
        //여러 스레드가 실행할 수 있는 영역
        synchronized (this){ //여기서 this는 공유 객체
            this.memory = memory;
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){}
            System.out.println(Thread.currentThread().getName()+": "+this.memory);
        }
    }
}

//1과 2는 동일하게 매개값을 메모리에 저장
//2초간 일시 정지 후 메모리값에 출력됨