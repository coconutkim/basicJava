package basic_241016;

public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student();
		// 메모리에 인스턴스 생성
		
		s.setName("sunshin lee");
		s.setGrade(2);
		String name = s.getName();
		int grade = s.getGrade();
		System.out.println(name+", "+grade);
	}
}
