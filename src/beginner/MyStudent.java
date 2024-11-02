package beginner;

public class MyStudent {
	// 파이썬과 다르게 먼저 선언해야 한다
	
	// 속성: 외부에서 정보를 가져와 값을 저장한다
	private String name;
	private int age;
	// 학생의 객체 정보
	// private를 사용하면 외부에서 못 본다. 데이터를 보호할 수 있다
	// 변수를 선언하면 객체를 초기화해야 한다
	
	public MyStudent() {// 생성자 함수: 객체(속성) 초기화
		this("web", 21);// 다른 생성자 메소드를 호출
	}
	
	public MyStudent(String name, int age) {
		// 외부에서 전달하는 매개변수가 필요하다
		this.name=name; // name=name;
		// 파이썬 클래스의 self와 같다
		this.age=age;
		}
	public String toString() {// 재정의
		return name+" "+age;
	}
}
