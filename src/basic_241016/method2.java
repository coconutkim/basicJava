package basic_241016;

import java.util.Random;
import java.util.Scanner;

public class method2 {
	public static void main(String[] args) {
		multiply();
		
	}
	private static void multiply() {
		// 입출력하는 메소드
		// 두 수를 이용해 난수 발생
		Random rand=new Random();
		int num1=rand.nextInt(9);		// 종료: -99
		int num2=rand.nextInt(9);
		int result=num1*num2;
		// num1*num2은 얼마?, num1, num2
		System.out.println("종료: -99");
		System.out.printf("%d * %d는 얼마일까요?", num1, num2);
		
		getAnswer(num1, num2, result);
		}
	private static void getAnswer(int num1, int num2, int result) {
		Scanner sc=new Scanner(System.in);
		int answer=sc.nextInt(); // 사용자 정답을 입력
		if(answer==-99) {
			System.out.println("종료");
			System.exit(0);
			return
		}
		while (answer==result) {
			System.out.println("맞지 않음 시도");
			System.out.println("good", num1, num2);
			multiply();
			getAnswer(num1, num2, )
		else
	}
}
