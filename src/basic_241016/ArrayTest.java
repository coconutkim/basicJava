package basic_241016;

//import java.util.ArrayList;

public class ArrayTest {
	public static void main(String[] args) {
		// 지역변수 선언
		int[] score1 = {23,45,67,87,88,99,13,77,65};
		int[] score2 = {56,78,98,88,77,55,43,21,99,67};
		
		// 인스턴스 생성
		ArrayUtil u = new ArrayUtil();
//		ArrayList u = new ArrayList();
		
		// 메서드 호출
//		ArrayUtil.calcArray(score1);
		u.calcArray(score1); //주소
		u.sortArray(score1);
		
		System.out.println();
		u.calcArray(score2);
		u.sortArray(score2);
	}
}
