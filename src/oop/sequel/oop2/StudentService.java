package oop.sequel.oop2;

public class StudentService {
	final int MAX_SIZE = 50;
//	final을 통해 변수의 값을 변경할 수 없도록 고정
//	상수를 정의
	Student[] infoSt = new Student[MAX_SIZE];
	int count = 0;

	public void inputData() {
		System.out.println("데이터 입력을 시작합니다.");
		System.out.print("name: ");
		String name = ScanData.sc.next();
		System.out.print("grade: ");
		int grade = ScanData.sc.nextInt();
		// 입력한 내용을 인스턴스로 생성한다
		infoSt[count++] = new Student(name, grade);
		// 순차적으로 0.1.2 ... 를 센다
		// 배열로 선엄함, 객체를 생성함
		System.out.println("sucessful data input");
	}

	public void searchData() {
		System.out.println("start searching data...");
		System.out.print("name: ");
		String name = ScanData.sc.next();
		int idx = search1(name); // int idx = 5
		// 인덱스가 있다는 것은 데이터가 존재한다는 뜻
//		데이터가 없기 위해서는 0보다 작은 값이 와야 한다
		if (idx < 0)
			System.out.println("no data here");
		else
			System.out.println("complete searching data");
	}

	private int search1(String name) {
		// 입력한 이름과 배열에 저장되어 있는 이름과 비교함
//		존재하면 이름을 반환한다
		for (int i = 0; i < count; i++) {
			Student curSt = infoSt[i];
			if (name.compareTo(curSt.getName()) == 0)
				return i;
		}
		return -1;
//		찾으려는 값이 없기에 -1을 반환한다
	}

	public void deleteData() {
		System.out.println("start deleting data...");
		System.out.print("name: ");
		String name = ScanData.sc.next();
		int idx = search1(name); // int idx = 5

		if (idx < 0)
			System.out.println("no data here");
		else {
			// 배열 이동
			// 배열 요소를 1 감소
			for (int i = idx; i < (count-1); i++)
				infoSt[i] = infoSt[i + 1];
			count--;
			System.out.println("complete deleting data");
		}
	}
	
	private int search(String name) {
		// 입력한 이름과 배열에 저장되어 있는 이름과 비교함
//		존재하면 이름을 반환한다
		for (int i = 0; i < count; i++) {
			Student curSt = infoSt[i];
			if (name.compareTo(curSt.getName()) == 0)
				return i;
		}
		return -1;
//		찾으려는 값이 없기에 -1을 반환한다
	}
}
