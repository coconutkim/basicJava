package oop.abst1;

public abstract class Student {
    String name;
    int grade;
    String teacher;

    public Student(){
        System.out.println("Student constructor calling");
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getStudInfo(){
        System.out.println("student class's getstudinfo() method calling");
        return "name: "+name+" / grade: "+grade;
    }

    public abstract String getTeacher();
}
