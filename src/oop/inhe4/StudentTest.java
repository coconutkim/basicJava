package oop.inhe4;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("scoups", 11);

        System.out.println("name: "+s1.name);
        System.out.println("grade: "+s1.getGrade());
    }
}
