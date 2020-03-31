package Day0331;

import java.util.StringTokenizer;

public class TokenEx {
	public static void main(String[] args) {
		String now = "2020/03/31";
		
		StringTokenizer st = new StringTokenizer(now, "/");
		
		int cnt = st.countTokens();
		System.out.println("���� ��ū ��: " + cnt);	//���� ��ū ��: 3
		
		while(st.hasMoreTokens()) {
			String temp = st.nextToken();	//ù ��° ��ū�� ��ȯ�ϰ�(temp�� ��ȯ) ó������ ���ư���.
			System.out.println(temp);	//2020 03 31
		}
		
		
		String[] arr = now.split("/");
		for(String str : arr) {
			System.out.println(str);
		}
	}
}
