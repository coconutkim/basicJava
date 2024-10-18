package basic_241016;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest01 {
	public static void main(String[] args) {
//		Map<K, V> map = new HashMap<K, V>
		Map map = new HashMap();
//		자바 1.0의 방식, 한마디로 구식
//		map.put("first", new Integer(100));
		map.put("first", Integer.valueOf(100));
		map.put("seoncd", "hello world");
		map.put("third", new MyStudent());
		map.put("fourth", null);
		
		Set set = map.keySet();
		Collection col = map.values();
		
//		집합은 무질서하기에 배열로 변환한다
		Object[] obj = set.toArray();
		for(int i=0;i<obj.length;i++) {
			System.out.println(obj[i]);
		}
		
		System.out.println();
		
		for(int i=0;i<obj.length;i++) {
//			타입 변환과 명시를 동시에
			String key = (String)obj[i];
			System.out.println(map.get(key));
		}
	}
}
