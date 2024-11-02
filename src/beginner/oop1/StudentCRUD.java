package beginner.oop1;

import java.util.Scanner;

public class StudentCRUD {
	Scanner sc;
	Student st;
	// 일종의 멤버, 구성원, 즉 속성이다
	// 클래스 안에 구성원끼리는 접근이 된다
	// 지역변수가 아닌 전역변수가 된다
	
	public StudentCRUD() {
		sc = new Scanner(System.in);
		st = new Student("cho");
		st = new Student(1);
		st = new Student("1");
		
//		앞에 scanner는 지워준다
//		이미 클래스 내에 sc라는 필드가 선언되어 있다
//		System.in은 표준 입력 standard input을 나타내는 객체
//		키보드로부터 입력을 받기 위해 scanner 객체를 생성하는 코드
	}
	
	public void saveStudent() {
		// student 클래스 사용
		System.out.println("save file");
		
		System.out.println("name: ");
		String name = sc.next(); // 사용자 입력을 받기 위해 사용되는 코드
		
		System.out.println("grade: ");
//		int num = 100;
		int grade = sc.nextInt();
		
		st = new Student(name, grade);
		// 스튜던트의 생성자 메소드 이용
		//객체가 만들어진다
		// 출력 studentPrint()
		System.out.println();
	}
	
	public void studentPrint() {
//		System.out.println(st);
//		System.out.println(st.getName());
//		System.out.println(st.getGrade());
		
//		System.out.println(num);
//		지역변수이기에 출력이 안 된다
//		전역변수여야 한다
	}
	
	public void updateStudent() {
		System.out.println("name: ");
		String name = sc.next();
		st.setName(name);
		
		System.out.println("grade: ");
		int grade = sc.nextInt();
		st.setGrade(grade);
	}
}
