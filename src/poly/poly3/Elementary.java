package poly.poly3;

public class Elementary extends Student{

//    public Elementary(String name,int grade){
//        this.name = name;
//        this.grade = grade;
//    }

    public Elementary(String name, int grade, String gender,int age){
        this.name = name;
        this.grade = grade;
        super.gender = gender;
        super.age = age;
    }

    @Override
    public String getTeacher() {
        return "ms.smith";
    }
}
