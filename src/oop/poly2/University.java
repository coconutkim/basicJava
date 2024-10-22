package oop.poly2;

public class University extends Student {
    private int courses;

    public University(String name, int grade, int courses,
                      String gender, int age){
        super.name = name;
        super.grade = grade;
        this.courses = courses;
        super.gender = gender;
        super.age = age;
    }

    public University(String name, int grade, int courses){
        super.name = name;
        super.grade = grade;
        this.courses = courses;
    }

    public int getCourses() {
        return courses;
    }
}
