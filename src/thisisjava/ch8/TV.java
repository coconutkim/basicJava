package thisisjava.ch8;

public class TV implements Remocon{

    @Override
    public void powerOn(){
        System.out.println("turn on TV");
    }
    public static void main(String[] args){
        Remocon r = new TV();
        r.powerOn();
    }
}
