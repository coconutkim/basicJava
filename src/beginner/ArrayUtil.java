package beginner;

public class ArrayUtil {
	// 배열 요소값들의 총합과 평균을 구하는 메서드
	public void calcArray(int[] num) {
		int total=0; // 총합을 저장하는 변수
		float average=0f; // 평균을 저장하는 변수
		
		for(int i=0;i<num.length;i++) {
			total+=num[i];
			
		}
		average = (float)total/num.length;
		System.out.println(total+", "+average);
	}
	
	public void sortArray(int[] num) {
		int temp=0;
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length;j++) {
				if(num[i]<num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
	}
}
