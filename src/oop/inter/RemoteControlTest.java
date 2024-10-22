package oop.inter;

public class RemoteControlTest {
    public static void main(String[] args) {
        // 인터페이스 변수 선언
        RemoteControl rc;

        // 변수에 television 객체를 대입
        rc = new Television();
        rc.turnOn();
        rc.setVolume(100);

        rc.setMute(true);
        rc.setMute(false);
//        rc.turnOff();

        System.out.println();

        // 변수에 audio 객체를 대입
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(58);
//        rc.turnOff();

        //call default method
        rc.setMute(true);
        rc.setMute(false);

        System.out.println();

        RemoteControl.changeBattery();

//        System.out.println("remote max volume: "+RemoteControl.MAX_VOLUME);
//        System.out.println("remote min volume: "+RemoteControl.MIN_VOLUME);
    }
}
