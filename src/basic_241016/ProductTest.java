package basic_241016;

import java.util.ArrayList;
import java.util.LinkedList;

public class ProductTest {
	public static void main(String[] args) {
		ArrayList<Product> pList=new ArrayList<Product>();
		// 객체가 아무거나 들어올 수 없다
		
//		LinkedList<Product> l=new LinkedList<Product>();
		Product p1=new Product();
		System.out.println(p1);
		Product p2=new Product("0002","smart TV", "white", 200);
		Product p3=new Product("0003","laptop", "silver", 200);
		
		// 리스트는 객체의 모임
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		// 객체 저장함
		
//		ProductTest는 프린트 클래스를 사용한다
		ProductPrint p=new ProductPrint();
		// 부모 정보가 있기 때문에 오류가 나지 않는다
		p.getProductInfo(pList);
//		p.getProductInfo(l);
	}
}

//plist는 arraylist로부터 상속을 받아 만듬
//상속을 이용하지 않는다면 어레이, 링크드를 따로 번거롭게 만들어야 한다