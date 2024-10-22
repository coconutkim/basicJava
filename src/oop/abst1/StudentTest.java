package oop.abst1;

public class StudentTest {
    public static void main(String[] args){
        Elementary e = new Elementary("hoshi",3,"ms.grace");
        System.out.println("student name: "+e.getName());
        System.out.println(e.getTeacher());

        Student u = new University("html",3,34,"mr.kim");
//        다운캐스팅으로 부모 클래스의 인스턴스를 자식 클래스의 타입으로 변환
//        University u2 = (University)u
//        String str = u2.getStudInfo();
        String str = u.getStudInfo();
        System.out.println(u.getTeacher());
    }
}
