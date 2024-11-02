package inter.inter1;

public interface RemoteControl {
    // public 추상 메소드
//    public void turnOn();

    // 상수 선언
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // 추상 메소드
    void turnOn();
    void turnOff();
    void setVolume(int volume);

    // 디폴트 인스턴스 메소드
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("set mute mode");
            // 추상 메소드 호출하면서 상수 필드 사용
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("unlock mute mode");
        }
    }

    static void changeBattery(){
        System.out.println("please change the batteries");
    }
}
