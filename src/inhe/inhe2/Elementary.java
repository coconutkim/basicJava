package inhe.inhe2;

public class Elementary extends Student {
	public Elementary(String _name, int _grade) {
		// 생성자나 메서드 내부에서 필드 값의 초기화
		name = _name;
		grade = _grade;
		// Student에서 접근을 private으로 설정해놔서 visibility 오류가 생긴다
		// private 기능을 가지면서 부모 클래스의 멤버에 대한 자식 클래스를 접근 허용
		// >> protected
	}
	
	public Elementary(String _name, int _grade, String _gender, int _age) {
		// 생성자나 메서드 내부에서 필드 값의 초기화
		name = _name;
		grade = _grade;
		gender = _gender;
		age = _age;
		// Student에서 접근을 private으로 설정해놔서 visibility 오류가 생긴다
		// private 기능을 가지면서 부모 클래스의 멤버에 대한 자식 클래스를 접근 허용
		// >> protected
	}
}
