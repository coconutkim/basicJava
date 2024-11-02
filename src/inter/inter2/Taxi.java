package inter.inter2;

public class Taxi implements Vehicle{
    //택시 클래스가 인터페이스의 규격을 따른다

    @Override
    public void run(){
        System.out.println("taxi is running");
    }

    public void checkFare(int fare){
        System.out.println("checking fare"+fare);
    }
}
