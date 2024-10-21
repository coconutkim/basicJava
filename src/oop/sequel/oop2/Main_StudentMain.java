package oop.sequel.oop2;

public class Main_StudentMain {
	public static void main(String[] args) {
		StudentService service = new StudentService();
		
		while (true) {
			// 메뉴 클래스를 부른다
			Menu.showMenu();
			int sel = ScanData.sc.nextInt();
//		1번만 입력이 되기에 반복이 필요하다
			switch (sel) {
			case 1: // 입력
				service.inputData();
				break;
			case 2: // 검색
				service.searchData();
				break;
			case 3: // 삭제
				//검색과 삭제는 방법이 같다
				service.deleteData();
				break;
			case 4: // 종료
				System.out.println("the end");
				System.exit(0);
			} // switch
		} // while
	} // main
} // class
