package inhe.inhe2;

public class Student extends Person  {
	// 필드(멤버 변수)
	protected String name;
	protected int grade;
	
	// 생성자
	public Student() {
//		System.out.println("parent constructor");
	}

	public Student(String name, int grade) {
		setName(name);
		setGrade(grade);
	}
	
	//메서드(함수)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getStudentInfo() {
//		System.out.println("Student 클래스의 getStudentInfo() 호출");
		return "name: " + name + " / grade: " + grade
				+" / gender: "+this.gender+" / age: "+this.age;

	}
}
