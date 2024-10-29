package crud;

public class Main_EmployeeTest {
    public static void main(String[] args){
        Regular r = new Regular(1000,"hoshi", 2000, 300);
        int totalPay = r.calcTotalPay();
//        System.out.println("정규직 급여: "+totalPay);
        // 부모 클래스로 자식 클래스 인스턴스 생성
        Employee emp = new Regular(888,"python", 20, 30);
        totalPay = emp.calcTotalPay();
        System.out.println("full-time salary: "+totalPay);

        Employee temp;
        temp = new Temporary(54,"web",10,20,500);
        totalPay = temp.calcTotalPay();
        String strName = temp.name;
        System.out.println("name: "+strName+" | pay: "+totalPay);
    }
}
