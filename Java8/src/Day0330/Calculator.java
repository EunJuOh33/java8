package Day0330;

public class Calculator {
	//�޼ҵ�
		void powerOn() {	//void - ���ϰ��� ���ٴ� ��
			System.out.println("������ �մϴ�.");
	}
		
	int plus(int x, int y) {	//int�� �ݵ�� ���� ���� �־���Ѵ�.
		int result = x + y;
		return result;
	}
	
	int plus(long x, long y) {	//�ߺ� ����
		int result = (int)x + (int)y + 10000;
		return result;
	}
	
	double divide(int x, int y) {		//double�� ��ȯ�ϴ� divide��� �޼���
		double result = (double) x / y;
		return result;
	}
	
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
}
