package oop.poly2;

import javax.swing.*;

public class StudentTest {
    public static void main(String[] args){
        String profile = null;
//        String name, int grade, String gender,int age
        Person p1 = new Elementary("java", 5, "male", 6);
//        String name, int grade, int courses,
//        String gender, int age
        Person p2 = new University("python", 4, 4, "f", 12);

        profile = ((Student)p1).getStudInfo();
        System.out.println("student info: "+ profile);
    }
}
