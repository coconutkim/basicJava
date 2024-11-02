package inter.inter2;

public class Driver {

    void drive(Vehicle vehicle){

        if(vehicle instanceof Bus){
            Bus bus = (Bus) vehicle;
            bus.checkFare();
        }
        // 버스 탈 때마다 요금 계산
        // 충전 기능
        // 금액을 입력받아 완료 시 완료되었다는 문자열 표시
        // 요금을 내면 잔액이 줄어들어야 한다

        else if (vehicle instanceof Taxi) {
            Taxi taxi = (Taxi) vehicle;
            taxi.checkFare(30);
        }
        vehicle.run();
    }
}
