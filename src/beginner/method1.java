package beginner;

import java.util.Scanner;

public class method1 {
	public static void main(String[] args) {
		int res=inputInt();
		System.out.println(res);
		
		int res2=inputInt();
		int sum=res+res2;
		System.out.println(sum);
		
//		System.out.println("입력=");
//		int num=sc.nextInt();
//		
//		System.out.println(num);
//		
//		System.out.println("입력=");
//		num=sc.nextInt();
//		
//		System.out.println("입력=");
//		num=sc.nextInt();
	}

	private static int inputInt() {
		Scanner sc = new Scanner(System.in);
		// 하나의 결과를 가진다
		System.out.println("입력=");
		int num=sc.nextInt();
		System.out.println();

		return num;
	}
}
