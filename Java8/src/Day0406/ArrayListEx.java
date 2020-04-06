package Day0406;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListEx {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();	//java.util�� ArrayList�� ����Ѵ�.
		System.out.println(list.size());
		
		list.add("���");
		list.add("��");
		list.add("������");
		list.add("���ξ���");
		
		System.out.println(list.size());
		System.out.println();
		
		String str = list.get(0);
		System.out.println(str);
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		list.add(2, "����");		//�߰� ������ �ϸ� �� ĭ�� �и��� �ȴ�.
		for(String temp : list) {
			System.out.println(temp);	//��� �� ���� ������ ���ξ���
		}
		System.out.println();
		
		list.remove(1);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));	//��� ���� ������ ���ξ���
		}
		System.out.println();
		
		list. remove("������");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		list. set(1, "����");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.size());
		System.out.println();
		
		System.out.println(list.contains("����"));
		System.out.println(list.contains("����"));
		System.out.println(list.isEmpty());
		System.out.println();
		
		if(!list.isEmpty()) {
			list.clear();
		}
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println();
		
		
		int[] arr = new int[] {10, 20, 30, 40, 50};
		for(int num : arr) {
			if(num == 30) {
				System.out.println(num == 30);	//true
			}
		}
		System.out.println();
		
		List<Integer> arrList = Arrays.asList(10, 20, 30, 40, 50);
		System.out.println(arrList.contains(30));
		System.out.println();
		
		Integer[] ary = arrList.toArray(new Integer[arrList.size()]);
		arrList.clear();		//������Ѻ��� clear�� remove�� ����� �ȵȴٴ� ���� �� �� �ִ�.
		System.out.println(arrList.get(0));
	}
}
