package Day0406;

import java.util.ArrayList;
import java.util.List;

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
	}
}
