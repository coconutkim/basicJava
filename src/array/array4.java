package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array4 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in=
				new BufferedReader(new InputStreamReader(System.in));
		int[] arr=new int[3];
		int sum=0,max=0;
		
		System.out.println("3개의 값을 입력하세요.");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println((i+1)+"번째");
			arr[i]=Integer.parseInt(in.readLine());
		
			sum+=arr[i];
			if(max<arr[i]) 
				max=arr[i];
			
		}
		int ave=sum/arr.length;
		System.out.println("------------------------");
		System.out.println("결과");
		System.out.println("합계"+sum+" 평균"+ave+" 최대값"+max);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("배열 정렬 전 내용");
			System.out.println(arr[i]);
		}
	}
}
