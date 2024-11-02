package inter.inter1;

public class Audio implements RemoteControl {

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("turn on audio");
        // 인터페이스에 선언된 turn on 추상 메소드 재정의
    }

    @Override
    public void turnOff() {
        System.out.println("turn off audio");
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
        System.out.println("current audio volume: " + this.volume);
    }

    //field
    private int memoryVolume;

    //redefine default method
    @Override
    public void setMute(boolean mute) {
        if (mute) {
            this.memoryVolume = this.volume;
            //현재 볼륨을 memoryvolume에 저장
            System.out.println("set mute mode");
            //음소거 상태임을 알리기 위해 set mute mode 출력
            setVolume(RemoteControl.MIN_VOLUME);
            //볼륨을 최소값으로 설정
        } else {
            System.out.println("unlock mute mode");
            //음소거 해제를 알림
            setVolume(this.memoryVolume);
            //저장해 두었던 값을 볼륨에 다시 적용
        }
    }
}
