package oop_sequel.oop1;

import oop2.Student;
import oop2.Human;

public class StudentTest {
	public static void main(String[] args) {
//		new Student(null,0);
		// 초기화된 상태
//		Student st = new Student("python",20);
//		Student st2 = new Student("java",21);
//		
//		System.out.println(st);
//		System.out.println(st2);
//		// 속성값을 변경 set 메소드
//		
//		st2.setName("programming");
//		String name = st2.getName();
//		System.out.println(name);
//		
//		int grade = st2.getGrade();
//		System.out.println(grade);
//		System.out.println(st2);
		Student st = new Student("cho", 1);
		System.out.println(st.toString());
		System.out.println((Object)st.toString());
		System.out.println(st.walk());
		Human hu = (Human)st;
		System.out.println(hu.walk());
	}
}
