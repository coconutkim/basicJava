package inhe.inhe2;

public class University extends Student {
	// Student를 상속한다
	private int courses;

	public University(String _name, int _grade, int _courses) {
//		name = _name;
		super.name = name;
//		grade = _grade;
		super.grade = _grade;
		// name, grade는 부모의 것이기 때문에 getter and setter는
		// courses만 적용이 된다
//		courses = _courses;
		courses = _courses;
		// _를 추가하는 이유
		// 필수가 아닌 선택 사항이며 변수 이름을 구분하기 위함
	}

	public int getCourses() {
		return courses;
	}

	public void setCourses(int courses) {
		this.courses = courses;
	}


}
