package thisisjava.ch7;

public class SnowTireExample {
    public static void main(String[] args){
        SnowTire snowTire = new SnowTire();
        Tire tire = snowTire;
//        타이어의 타이어 타입으로 선언되었지만,
//        실제로는 snowtire의 인스턴스를 참조한다

        snowTire.run();
        tire.run();
    }
}

//내 정답
//snow tire is rolling
//normal tire is getRolling
//
//정답
//snow tire is rolling
//snow tire is rolling