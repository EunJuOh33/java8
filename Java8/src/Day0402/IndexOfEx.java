package Day0402;

public class IndexOfEx {

	public static void main(String[] args) {
		String str = "�ڹ� ���α׷���";
		int index = str.indexOf("����");	
		System.out.println(index);	//3
		index = str.indexOf("C���");
		System.out.println(index);	//-1
		
		str = "�ڹ��ڹ��ڹ� �������� �׷����Դϴ�.";
		index = str.indexOf("��");	//�Ű������� �� ���� ��쿡�� 0������ �˻�
		System.out.println(index);	//1
		index = str.indexOf("��", index + 1);	//ù��° �Ű�����: �˻���, 2��° �Ű�����: �˻� ���� ��ġ
		System.out.println(index);	//3
		index = str.indexOf("��");
		System.out.println(index);	//0
		
		//replace
		String str2 = str.replace("��������", "����");
		System.out.println(str2);	//�ڹ��ڹ��ڹ� ���� �׷����Դϴ�.
	}
}
