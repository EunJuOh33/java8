package Day0401;

public class OverrideChild extends OverrideParent {
	void method3() {
		System.out.println("�ڽ� �޼���3");
	}
	
	@Override	//������ �Ѵٴ� ���� �˷��ִ� �ּ�
	void method2() {
		System.out.println("�ڽ� �޼���2");
	}
}
