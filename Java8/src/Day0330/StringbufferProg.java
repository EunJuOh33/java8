package Day0330;

public class StringbufferProg {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Java Programming");	//StringBuffer�� ���� ����
		StringBuffer str2;	//������ ����. null
		
		str2 = str.insert(5,  "JSP");	//str�� 5��°�� "JSP"�߰��Ͽ�
										//str2�� str�� �������� ������. (str�� ����� str2�� ������ ���� �ȴ�.)
		System.out.println(str);
		System.out.println(str2);
		
		
		str.append("Good");	//str�� ���� ���ڿ� "Good"�߰�
		str.append('A');
		System.out.println(str2);	//str�� ���� ������ ���� �ƴ϶� �ּҸ� �����Ա� ������
									//str�� str2�� ������ ����.
		
		str2.reverse();
		System.out.println(str2);
		
		str.setLength(10);
		System.out.println(str);
	}
}
