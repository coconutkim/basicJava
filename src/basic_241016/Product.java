package basic_241016;

public class Product {
	private String code;
	private String name;
	private String color;
	private int qty;
	// 비공개를 데이터에 전달하는 방법이 메소드
	
	// 속성 메소드: get() set()
	// 값을 변경하거나 저장할 때는 set method
	
	// ***
	public void setCode(String Code) {
		this.code=code;
		
	}
	public String getCode() {
		return code;
	}
	
	public void setName(String name) {
		this.name=name;
		
	}
	public String getName() {
		return name;
	}
	
	public void setColor(String color) {
		this.color=color;
		
	}
	public String getColor() {
		return color;
	}
	
	public void setQty(int qty) {
		this.qty=qty;
	}
	public int getQty() {
		return qty;
	}
	// ***
	// ***는 하나의 쌍이다
	
	@Override // 재정의
	public String toString() {
		return code+","+name+","+color+","+qty;
	}
	
	// 기본 생성자 메소드: 컴파일러가 한다
	public Product() {
		this("0001","smartphone","black",100);
//		System.out.println("매개변수가 없는 생성자 메소드");
//		System.out.println(code);
//		System.out.println(qty);
	}
	
	// 초기값을 준다
	// 개수가 맞고 순서대로 들어와야 한다
	public Product(String code,String name,String color,int qty) {
		
//		String과 같은 참조형 데이터 타입의 경우 기본값이 null
//		생성자에서 명시적으로 null로 초기화하는 것도 가능합니다
		this.code=code;
		this.name=name;
		this.color=color;
		this.qty=qty;
	}
}

//출력 순서
//1. this("0001", "smartphone", "black", 100)에서 매개변수가 있는 생성자가 호출
//2. 해당 값들이 code, name, color, qty에 할당
//3. 그런 다음 기본 생성자의 System.out.println()이 호출
//4. "매개변수가 없는 생성자 메소드"가 출력
//5. 그 후에 code와 qty가 출력
