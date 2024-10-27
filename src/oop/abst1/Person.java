package oop.abst1;

public class Person {

    protected String gender;
    protected int age;

    public Person(){
        System.out.println("person constructor calling");
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
