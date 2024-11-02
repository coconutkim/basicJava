package beginner;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		Map map = new HashMap();
		// int 타입이 될 수 없는 이유
//		자바에서는 객체를 담는 데이터 구조(예: 컬렉션 프레임워크)의 요소는
//		반드시 참조 타입이어야 합니다.
//		즉, 기본 데이터 타입을 직접 사용할 수 없습니다.
//		대신, 기본 데이터 타입을 래핑(wrapping)하는 객체 타입을 사용해야 합니다.

		// 맵은 키로 값을 찾아야 한다
//		앞이 키, 뒤가 값
		map.put("first", new Integer(100));
		map.put("second", "hello world");
		map.put("third", new MyStudent());
		map.put("fourth", null);

		Integer i = (Integer) map.get(1);

		String str = (String) map.get("second");
		// second라는 키 값으로 찾는다
		System.out.println(i);
		System.out.println(str);

		MyStudent st = (MyStudent) map.get("third");
		System.out.println(st);
		System.out.println(map.get("third"));
		System.out.println(map.get("fourth"));
	}
}
