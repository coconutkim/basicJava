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

    public int getCommision() {
        return commision;
    }

    int calcTotalPay() {
        int totalPay = 12 * payPerMonth + commision;
        return totalPay;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", name='" + name +
                ", payPerMonth=" + payPerMonth +
                ", commision=" + commision +
                ", calcTotalPay="+calcTotalPay()+
                '}';
    }
}
