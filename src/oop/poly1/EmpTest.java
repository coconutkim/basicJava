package oop.poly1;

public class EmpTest {
    public static void main(String[] args){

        Employee e = new Account("java","chief");
        Employee r = new Research("java2","development","newcomer");

        e.getEmpInfo(e);
        e.getEmpInfo(r);
    }
}
