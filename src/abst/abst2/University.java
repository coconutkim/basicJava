package abst.abst2;

public class University extends Student {
    private int courses;

    public University(String name,int grade,int courses,String teacher){
        super();
        System.out.println("university constructor calling");
        super.name = name;
        super.grade = grade;
        super.teacher = teacher;
        this.courses = courses;
    }

    public String getStudInfo(){
        return name+grade+courses;
    }

    @Override
    public String getTeacher() {
        return "academic advisor: "+super.teacher;
    }
}
