package array;

import java.util.Scanner;

public class array2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("배열 입력");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
			
			int max=arr[0];
			int min=arr[0];
			
			for(int i=0;i<arr.length;i++) {
				if(max<arr[i]) max=arr[i];
				if(min>arr[i]) min=arr[i];
				}
			}
				
	}
