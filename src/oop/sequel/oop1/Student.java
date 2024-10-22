package oop.sequel.oop1;

public class Student extends Human {
//	private String name; // 필드
	int grade; // 학년
	// overloading (중복 메소드)
	public Student() {
		this("web",2);
	}
	
	
	public String walk() {
		return "아악~ 대가리 아파!!";
	}
	
	// 우클릭 > source > contructor using field
	public Student(String name, int grade) {
//		super();
		// 부모 클래스를 호출하는데 사용함
		// 부모 클래스의 생성자를 명시적으로 호출함
//		this.name = name;
		// 직접적으로 필드 네임에 전달된 값을 할당한다
		setName(name);
		// 세터 메서드를 호출
		// 프라이빗 필드 값을 설정하기 위해 사용
		// 캡슐화를 하는 경우, 외부에서 접근하지 못하기에 사용
//		this.grade = grade;
		setGrade(grade);
	}
	
	/**
	 * 기본적으로 1학년이 됨.
	 * @param name
	 */
//	public Student(String name) {
//		setName(name);
//		this.grade = 1;  //디폴드 값
//	}
	
	public Student(int grade) {
		this.grade = grade;
		this.name = "이름없음";
	}
	
	/**
	 * 숫자로 된 문자열만 넣으세요 "1 ~ 3" 일학년
	 * @param grade
	 */
	public Student(String grade) {
		this.grade = Integer.parseInt(grade);
		this.name = "이름없음";
	}
	
//	right click > source > getter and setter
	public String getName() { // String name = "aaa";
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
	
//	매개변수의 개수가 다른 경우
	public void setGrade(int grade, String name) {
		this.grade = grade;
		this.name = name;
	}
//	매개변수의 타입이 다른 경우
	public void setGrade(String name) {
		this.name = name;
	}
//	반환 타입은 오버로딩의 조건이 아님(다른 것들은 다 동일하게 맞추고 반환 타입만 바꾸기)
//	public int setGrade(int grade) {
//		this.grade = grade;
//	}
	public int setGrade() {
		return grade;
	}
	@Override // 재정의 // 상속 시에만 발생한다
	public String toString() {      
		//tostring은 object의 것
		return "Student [name=" + name + ", grade=" + grade + "]";
	}
}
