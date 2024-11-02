package inter.inter3;

import java.util.Scanner;

public class Bus implements Vehicle{

    @Override
    public void board(){
        System.out.print("passenger: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name+" is boarding");
    }

//    버스 요금 지불
//    버스 요금은 고정됨: 대략 1500원
//    잔액을 검사하여 1500원보다 적으면 잔액이 부족하다는 문구 띄우기

//    특정 문자열(고객이름)에는 요금 정보를 담고 있다
//    탑승해서 요금을 지불하면 잔액이 여유로울 시 통과되며 그 금액만큼 차감된다
//    금액이 부족하면 금액 부족 문자를 날리며 요금 지불이 진행되지 않는다

//    passenger name: 'sam'
//    sam is boarding
//    payment complete
//    your balance: 1000
//
//    passenger name: 'julia'
//    julia is boarding
//    payment error: your balance is not enough
//    your balance: 500

//    would you like to charge your card? 'y' or 'n'
//    if n >> please take our bus next time
//    if y >> how much do you want charge? '1500'
//    charging complete
//    your balance: 5000


    @Override
    public void pay(){
        System.out.println();
    }
}
