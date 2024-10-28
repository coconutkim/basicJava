package thread;

public class Horse1 implements Runnable{
    private int horse_num;

    public Horse1(int horse_num){
        this.horse_num = horse_num;
    }

    public void run(){
        long sleeptime = (long) (Math.random() * 500);
        System.out.println("No."+horse_num+" horse sleeps about "+sleeptime);
        try{
            Thread.sleep(sleeptime);
        }catch (Exception e){}
        for(int i=1;i<=10;i++){
            System.out.println("No."+horse_num+" horse arrived "+100*i+" meters");
        }
        System.out.println("No."+horse_num+" horse completed the racing");
    }
}
