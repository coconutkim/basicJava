package oop.poly1;

public class EmpTest {
    public static void main(String[] args){

        Employee e = new Account("java","research");
        Employee r = new Research("java2","development","newcomer");

        e.getEmpInfo(e);
        r.getEmpInfo(r);
    }
}
