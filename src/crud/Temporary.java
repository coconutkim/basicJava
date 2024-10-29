package crud;

public class Temporary extends Employee {
    private int workedHour;

    public Temporary(int empNo,String name, int payPerMonth, int commission, int workedHour){
        super(empNo,name, payPerMonth,commission);
        this.workedHour = workedHour;
    }

    @Override
    protected int calcTotalPay(){

        //int totalPay = 12 * payPerMonth + commission;
        //int temp = totalPay+workedHour+2000;

        int temp = super.calcTotalPay(); // 필요하면 인스턴스를 불러서 가져온다
        int tempTotalPay = temp+workedHour+2000;

        return 0;
    }
}
