package thread;

public class SumJoinTest {
    public static void main(String[] args){
        SumThread st = new SumThread();
        //메인과 스레드 중 누가 먼저 스타트를 할지 모른다
        //아직 스레드가 수행 중인데 메인이 먼저 끝내버려서 계산을 못 한다
        st.start(); //스레드
        try{
            st.join();
        }catch (InterruptedException e){

        } //스레드가 연산을 끝날 때까지 메인은 일시 정지 상태가 된다
        System.out.println("sum of from 1 to 100: "+st.getSum()); //메인
    }
}
