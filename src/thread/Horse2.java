package thread;

public class Horse2 implements Runnable{
    private int horse_num;

    public Horse2(int horse_num){
        this.horse_num = horse_num;
    }

    public void run(){
        for(int i = 1;i<=10;i++){
            System.out.println("No."+horse_num+" horse arrived "+100*i+" meters");
            if(horse_num == 8 && i == 5){ //8번 말이 500미터를 도착하면
                System.out.println("No.8 horse yield()...");
                Thread.yield(); //8번 말은 실행 대기 상태로 돌아간다
                try{
                    Thread.sleep(200); //0.2초간
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
