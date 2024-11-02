package poly.poly1;

public class Student extends Person{

    public int studentNo; // 필드 선언

    public Student(String name, int studentNo){
        super(name);
        this.studentNo = studentNo;
    }

    public void study(){
        System.out.println("studying");
    }
}
