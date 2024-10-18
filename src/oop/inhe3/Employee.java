package oop.inhe3;

public class Employee {
    String name;
    int payPerMonth;
    int commision;

    public Employee(String name, int payPerMonth, int commision){
    this.name = name; // 이름
    this.payPerMonth = payPerMonth; // 월 급여
    this.commision = commision; // 보너스
    }
    int calcTotalPay(){
        int totalPay = 12 * payPerMonth + commision;
        return totalPay;
    }
}
