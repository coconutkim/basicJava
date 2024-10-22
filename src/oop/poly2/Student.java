package oop.poly2;

public abstract class Student extends Person {

    protected String name;
    protected int grade;

//    public Student(){
//        System.out.println("student parent constructor calling");
//    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getStudInfo(){
        System.out.println("student class's getStudInfo() calling");
        return "name: "+name+" / grade: "+grade+" / gender: "+gender+" / age: "+age;
    }

    public abstract String getTeacher();
}
