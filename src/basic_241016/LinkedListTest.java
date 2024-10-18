package basic_241016;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> fruitList = new LinkedList<String>();
		fruitList.add("apple");
		fruitList.add("banana");
		fruitList.add("watermelon");
		fruitList.add(2, "mango"); // 추가한다
		fruitList.set(0, "orange"); // 0번째 요소를 오렌지로 바꾼다
		fruitList.remove(1); // 1번 요소를 제거한다
		fruitList.remove("watermelon"); // 워터멜론이라는 것을 제거한다

		int position = fruitList.indexOf("watermelon"); // 결과값이 정수형
		System.out.println("position of watermelon: " + position);
		System.out.println();

		for (int i = 0; i < fruitList.size(); i++) {
			String str = fruitList.get(i);
			System.out.println(str);
		}
	}

}
