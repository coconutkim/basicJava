package abst.abst2;

public class Elementary extends Student {
    public Elementary(String name,int grade,String teacher){
        System.out.println("elementary constructor calling");
        super.name = name;
        super.grade = grade;
        super.teacher = teacher;
        // 가독성이 떨어지면 매개변수 앞에 언더바를 붙인다
    }

    @Override
    public String getTeacher(){
        return "homeroom teacher: "+super.teacher;
    }
}
