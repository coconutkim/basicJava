package thread;

public class Horse3 implements Runnable{
    private int horse_num;

    public Horse3(int horse_num){
        this.horse_num = horse_num;
    }

    public void run(){
        for(int i = 1;i<=10;i++) {
            System.out.println("No." + horse_num + " horse arrived " + 100 * i + " meters");
        }
    }
}
