package crud;

public class Employee {
    int empNo;
    String name;
    int payPerMonth;
    int commision;

    public Employee(int empNo,String name, int payPerMonth, int commision) {
        this.empNo = empNo;
        this.name = name; // 이름
        this.payPerMonth = payPerMonth; // 월 급여
        this.commision = commision; // 보너스
    }

    public int getEmpNo() {
        return empNo;
    }

    public String getName() {
        return name;
    }

    public int getPayPerMonth() {
        return payPerMonth;
    }

    public int getCommission() {
        return commision;
    }

    int calcTotalPay() {
        int totalPay = 12 * payPerMonth + commision;
        return totalPay;
    }

    @Override
    public String toString() {
        //객체의 데이터를 문자열 형태로 표현
        //이 메서드가 없는 경우 객체의 고유한 메모리 주소를 출력
        return "Employee{" +
                "empNo=" + empNo +
                ", name='" + name +
                ", payPerMonth=" + payPerMonth +
                ", commision=" + commision +
                ", calcTotalPay="+calcTotalPay()+
                '}';
    }
}
