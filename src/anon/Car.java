package anon;

public class Car {

//    private Tire tire;
//
//    public Car(){
//        if(tire == null)
//            tire = new Tire();
//    }
//    외부에서 tire가 넘어올 경우 확인 작업 필요

    private Tire tire1 = new Tire();

    private Tire tire2 = new Tire(){
        @Override
        public void roll(){
            System.out.println("tire instance 1 of anonymous child is rolling");
        }
    };

    public void run1(){
        tire1.roll();
        tire2.roll();
    }

    public void run2(){
        Tire tire = new Tire(){
            @Override
            public void roll(){
                System.out.println("tire instance 2 of anonymous child is rolling");
            }
        };
//        중괄호 뒤에 ;이 붙는 이유
//        익명 클래스이기 때문
//
//        익명 클래스의 구문
//        중괄호 안에 클래스의 메서드나 멤버 정의
//        전체가 객체 생성 표현식이 되어 ;로 끝나야 함
        tire.roll();
    }

    public void run3(Tire tire){
        tire.roll();
    }
}
