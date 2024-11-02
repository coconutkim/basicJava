package beginner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class students {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("hello");// 파이썬의 list.append()와 같다
		// 노란줄은 경고다
		list.add(123);
		list.add(123.12);
		list.add(987f);
		list.add(new students());
		
		students st=(students)list.get(4);
		System.out.println(st);
		String str=(String)list.get(0);
		Integer num=(Integer)list.get(1);
		Float fnum=(Float)list.get(4);
		System.out.println(str+" "+num+" "+fnum);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		Iterator ele = list.iterator();
		while(ele.hasNext())
			System.out.println(ele.next());
	}
}
