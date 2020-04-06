package Day0406;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();	//java.util의 ArrayList를 사용한다.
		System.out.println(list.size());
		
		list.add("사과");
		list.add("배");
		list.add("오렌지");
		list.add("파인애플");
		
		System.out.println(list.size());
		System.out.println();
		
		String str = list.get(0);
		System.out.println(str);
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		list.add(2, "포도");		//중간 삽입을 하면 한 칸씩 밀리게 된다.
		for(String temp : list) {
			System.out.println(temp);	//사과 배 포도 오렌지 파인애플
		}
		System.out.println();
		
		list.remove(1);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));	//사과 포도 오렌지 파인애플
		}
		System.out.println();
		
		list. remove("오렌지");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		list. set(1, "참외");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.size());
		System.out.println();
		
		System.out.println(list.contains("참외"));
		System.out.println(list.contains("포도"));
		System.out.println(list.isEmpty());
		System.out.println();
		
		if(!list.isEmpty()) {
			list.clear();
		}
		System.out.println(list.isEmpty());
		System.out.println(list.size());
	}
}
