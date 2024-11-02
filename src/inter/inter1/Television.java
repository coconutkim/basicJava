package inter.inter1;

public class Television implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("turn on tv");
        // 인터페이스에 선언된 turn on 추상 메소드 재정의
    }

    @Override
    public void turnOff() {
        System.out.println("turn off tv");
    }

    @Override
    public void setVolume(int volume) {
//        볼륨 100이나 -1이면 오류
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("current tv volume: " + this.volume);
    }
}
