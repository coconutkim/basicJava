package thread;

public class WorkThread extends Thread{
    //field
    //private을 접근 제한자로 지정하면 get and set이 필요
    public boolean work = true;

    //constructor
    public WorkThread(String name){
        setName(name);
    }

    @Override
    public void run(){
        while (true){
            if(work){
                System.out.println(getName()+": processing tasks");
            }else {
                Thread.yield();
            }
        }
    }
}
