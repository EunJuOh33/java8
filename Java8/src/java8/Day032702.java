package java8;

public class Day032702 {
	public static void main(String[] args) {
		/*
		 * 0~9���� ����� �迭�� ��� �� 
		 * 0����  �ʱ�ȭ�Ͽ� ����ϼ���.
		 */
		int arr [] = new int[10];
		
		for(int i=0; i<arr.length; i++) {	//�迭�� 0~9���� ����
			arr[i] = i;
		}
		
		for (int number: arr) {
			System.out.print(number);	//����� �迭 ���
			
		}
		System.out.println();
		
//		for(int i=0; i<arr.length; i++) {	//������ ��Ҹ� 0���� �����ϴ� ���
//			arr[i] = 0;
//		}
		
		arr = new int[10];	//���ο� ��ü�� ����
							//���ο� ��ü�� �����ϴ� ��� 0���� �ٲ� ��.
		
		for (int number: arr) {
			System.out.print(number);	//�ʱ�ȭ�� �迭 ���
			
		}
		
		
	}
}
