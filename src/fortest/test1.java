package fortest;

public class test1 {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";

//indexOf 메서드는 주어진 문자열에서 특정 문자 또는 문자열이 처음으로 나타나는 인덱스를 반환합니다. 인덱스는 0부터 시작하므로, 문자열의 가장 첫 번째 글자는 인덱스 0을 가집니다.
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
	}
}
