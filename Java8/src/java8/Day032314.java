package java8;

public class Day032314 {
	public static void main(String[] args) {
		/* 1 ~ 10 �߿� 5�� ����� ���� ����ϼ���. */
		int sum = 0;	// ��������� �հ踦 sum�̶�� ���´�. 0���� �ʱ�ȭ.
		for(int i=1; i<=100; i++) {
			if(i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);	//1050
		
		
		/* 1 ~ 50 �߿� 3�� ����� ȭ�鿡 ����ϼ���. */
		for(int i=1; i<=50; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
		
		
		/* 1~ 50 �߿� 3�� ����� ���հ� ������ ����ϼ���. */
		int cnt = 0;
		sum = 0;	// ������ sum�� ��� ������ �ߺ��������� ���� �߻�. 
					// �̸��� �ٸ��� ���ְų� sum = 0; 0���� �ʱ�ȭ�ؼ� ����ؾ� ��.
		
		for(int i=1; i<=50; i++) {
			if(i % 3 == 0) {
				sum += i;
				cnt++;
			}
		}
		System.out.println("����: " + sum + ", ����: " + cnt);	//����: 408, ����: 16
	}
}
