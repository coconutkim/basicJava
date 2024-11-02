package inter.inter2;

public class DriverExample {

    public static void main (String[] args){

//        create instance named driver
        Driver driver = new Driver();

//        create instance embodying vehicle
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

//        convert type automatically
//        >> call overriding method
//        >> polymorphism
        driver.drive(bus);
        driver.drive(taxi);
    }
}

//이렇게 단계를 나누면 클래스가 많아져도 관리가 용이해진다

//고객이 버스에 탑승한다
//버스에 요금을 지불한다
//customers
//Bus bus
//public void pay()
//    bus.pay()
//using checkfare

//카드 요금을 확인한다
//요금이 없으면 충전한다
//요금을 충전하면 잔액이 채워진다
//충전이 완료되면 결과를 출력한다

//탑승 board
//지불 pay
