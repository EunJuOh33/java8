package Day0406;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("국어", 80);
		map.put("영어", 97);
		map.put("수학", 79);
		map.put("과학", 82);
		
		System.out.println(map.containsKey("국어"));	//true
		System.out.println(map.containsValue(90));	//false
		System.out.println(map.isEmpty());	//false
		System.out.println();
		
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println();
		
		
		//map.put
		map.put("과학", 80);
		keySet = map.keySet();	//같은 키라면, 뒤쪽에 넣은 값으로 바뀐다.
		for(String key : keySet) {
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println();
		
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();
			String key = entry.getKey();
			int score = entry.getValue();
			System.out.println(key + " : " + score);
		}
		System.out.println();
		
		
		//키만 넣은 remove
		int num = map.remove("수학");
		System.out.println(num);	//79
		keySet = map.keySet();
		for(String key : keySet) {
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println();
		
		
		//키와 value를 넣은 remove
		boolean isEntry = map.remove("과학", 80);
		System.out.println(isEntry);	//true, 과학이 없어진다.
		keySet = map.keySet();
		for(String key : keySet) {
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println();
		
		
		if(!map.isEmpty()) {
			map.clear();
		}
		System.out.println(map.size());
	}
}
