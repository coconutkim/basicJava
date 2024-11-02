package poly.poly1;

public class InstanceOfExample {
    // 인스턴스를 생성하지 않고도 호출할 수 있는 메서드
    public static void personInfo(Person person){
        System.out.println("name: "+person.name);
        person.walk();

        if(person instanceof Student student){
            System.out.println("studentNo: "+student.studentNo);
            student.study();
        }
    }
    public static void main(String[] args){
        Person p1 = new Person("gildong hong");
        personInfo(p1);

        System.out.println();

        Person p2 = new Student("gildong kim", 10);
        personInfo(p2);
    }
}
