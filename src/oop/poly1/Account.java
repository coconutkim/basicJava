package oop.poly1;

public class Account extends Employee{
    public Account(String name, String job){
        super.name = name;
        super.job = job;
    }
    public void disp(){
        System.out.println(super.name);
    }
}
