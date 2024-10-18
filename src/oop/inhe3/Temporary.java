package oop.inhe3;

public class Temporary extends Employee{
    private int workedHour;

    public Temporary(String name, int payPerMonth, int commision, int workedHour){
        super(name, payPerMonth,commision);
        this.workedHour = workedHour;
    }
    int calcTotalPay(){
        // 접근 제어자를 private으로 하면 main에서 불러오지를 못 한다
        int totalPay = 12 * payPerMonth + commision;
        int temp = totalPay+workedHour+2000;
        return 0;
    }
}
