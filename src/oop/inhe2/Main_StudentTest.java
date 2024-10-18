package oop.inhe2;

public class Main_StudentTest {
	public static void main(String[] args) {
		Elementary e = new Elementary("minghao", 8,"m", 6);
		University u = new University("wonwoo", 5, 9);
//		String str = e.getStudentInfo();

		System.out.println("student info 1) "+e.getStudentInfo());
		System.out.println("student info 2) "+u.getStudentInfo());
//		부모와 칸이 안 맞을 경우 확장이 필요하다

//		String gender = e.getGender();
//		int age = e.getAge();
//		System.out.println("gender: "+gender+" / age: "+age);

//		str = u.getStudentInfo();
//		System.out.println("student info 2) "+str+" / courses: "+u.getCourses());
	}
}
