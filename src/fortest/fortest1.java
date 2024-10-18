package fortest;

public class fortest1{
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			sum+=i;//sum=sum+i;
		}
		System.out.println('sum of 1~5'+sum);
		System.out.println('sum of 1~5:%d\n'+sum)
	}
}