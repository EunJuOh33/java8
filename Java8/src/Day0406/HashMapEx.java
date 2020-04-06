package Day0406;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("����", 80);
		map.put("����", 97);
		map.put("����", 79);
		map.put("����", 82);
		
		System.out.println(map.containsKey("����"));	//true
		System.out.println(map.containsValue(90));	//false
		System.out.println(map.isEmpty());	//false
		System.out.println();
		
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println();
		
		
		//map.put
		map.put("����", 80);
		keySet = map.keySet();	//���� Ű���, ���ʿ� ���� ������ �ٲ��.
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
		
		
		//Ű�� ���� remove
		int num = map.remove("����");
		System.out.println(num);	//79
		keySet = map.keySet();
		for(String key : keySet) {
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println();
		
		
		//Ű�� value�� ���� remove
		boolean isEntry = map.remove("����", 80);
		System.out.println(isEntry);	//true, ������ ��������.
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
