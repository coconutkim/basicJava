package oop.inhe3;

public class Main_EmployeeTest {
    public static void main(String[] args){
        Regular r = new Regular("hoshi", 2000, 300);
        int totalPay = r.calcTotalPay();
        System.out.println("정규직 급여: "+totalPay);
        // 부모 클래스로 자식 클래스 인스턴스 생성
        Employee emp = new Regular("python", 20, 30);
        totalPay = emp.calcTotalPay();
    }
}
