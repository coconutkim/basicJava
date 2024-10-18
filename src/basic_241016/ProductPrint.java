package basic_241016;

import java.util.List;

public class ProductPrint {
// 속성은 없애도 되고 메소드만 만들면 된다..?
	// 메소드 생성
	public void getProductInfo(List<Product> list) {
		// list라는 상자 안에 들어있는 것은 product
//		if (list.isEmpty()) {
//			System.out.println("empty");
//			return;
//		}
//		Product prod = list.get(0); // Product prod=new Product(,,,);
		// set메소드를 사용하는 것

		// 객체 초기화
		Product prod = null; // int a=0과 같다
		// 객체를 생성할 것이지만 번지를 아직 할당받지 않았다
		for (int i = 0; i < list.size(); i++) {
			prod = list.get(i); // new Product();
			// Product.java의 get메소드
			String code = prod.getCode();
			String name = prod.getName();
			String color = prod.getColor();
			int qty = prod.getQty();

			System.out.println(code);
			System.out.println(name);
			System.out.println(color);
			System.out.println(qty);
			System.out.println();
		}
	}
}

//들여쓰기 맞추기: ctrl+shift+f
