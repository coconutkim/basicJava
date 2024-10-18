package basic_241016;

public class MyStudentTest {
	public static void main(String[] args) {
		MyStudent my=new MyStudent("java", 21);
				// 생성자 메소드가 2개다
		System.out.println(my.toString());
		// Object라는 최상위 클래스로부터 상속을 받는다
		
		MyStudent my2=new MyStudent();
		System.out.println(my2);
	}
}
