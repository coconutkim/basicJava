package array;

public class array1 {
	public static void main(String[] args) {
		// 선언하기(메모리 몇 개를 할당함)
		int arr[];
		arr=new int[3]; // int arr[]=new int[3]
		System.out.println(arr[0]);
		System.out.println(arr); // 할당된 주소
		// 배열은 주소를 가진다
		
		// 배열에 데이터 저장
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		System.out.println(arr[2]);
		
		System.out.println();
		
		// 배열은 고정 크기를 가진다
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
		System.out.println();
		
		arr[2]=arr[0]+1000;
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		double arr2[]=new double[5]; // 길이가 5인 double형 배열 생성
		System.out.println(arr2[3]);
		
		int sum=0;
		int arr3[]= {100,200,300,400,500}
		for(int i=0;i<arr3.length;i++) {
			System.out.println(arr3[i]);
			System.out.println(arr3[i]);
			sum+=arr[i] // sum=sum+arr[i];			
		}
		System.out.println(sum);
		
		arr3=new int[3];
		for(int i=0;i<arr3.length;i++)
			System.out.println(arr3[i]);
		
		int arr4[]=new int[7];
		// 교환
		// int t=a;a=b;
		int temp[];
		temp=arr3;
		arr3=arr4;
		arr4=temp;
		for(int i=0;i<arr3.length;i++)
		
		
	}
}
