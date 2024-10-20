package fortest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fortest3 {
	public static void main(String[] args) throws IOException {
//		파일을 열거나 읽으려 할 때 해당 파일이 없으면 IOException이 발생
//		파일이나 디렉토리에 대한 읽기나 쓰기 권한이 없을 경우 예외 발생
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
//		BufferReader: 자바에서 입력 스트림을 읽기 위한 클래스
//		데이터를 한 줄 씩 읽지 않고 일정량의 데이터를 메모리에 미리 저장
		System.out.println("소수 여부에 대해 판단하는 프로그램");
		System.out.println("값 입력: ");
		int num=Integer.parseInt(in.readLine());
//		버퍼드리더를 사용하여 사용자로부터 입력받은 문자열을 정수형 int로 변환하는 코드
		for (int i=2;i<=num;i++) {
			if(num%i==0) {
			System.out.println("소수가 아닙니다");
			System.exit(0);
			}
		}
	}
}
