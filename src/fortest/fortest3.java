package fortest;

import java.io.BufferedReader;

public class fortest3 {
	public static void main(String[] args) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(null))
		System.out.println("소수 여부에 대해 판단하는 프로그램");
		System.out.println("값 입력:");
		int num=Integer.parseInt(in.readLine());
		for (int i=2;i<=num;i++) {
			if(num%i==0) {
			System.out.println("소수가 아닙니다");
			System.exit(0);
			}
		}
	}
}
