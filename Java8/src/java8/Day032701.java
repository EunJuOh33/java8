package java8;

public class Day032701 {
	public static void main(String[] args) {
		/*
		 * 1���� 100���� �����ϴ� �迭�� �����
		 * ��ü�� ���� ����ϴ� �ڵ带 �ۼ��ϼ���.
		 */
		int arr [] = new int[100];
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + "\t");	//���� ��� 0�� ����
			if((i+1) % 5 == 0) {		//5�پ� ����ϱ� ���� �ڵ�
				System.out.println();
			}
		}
		System.out.println();
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i + 1;
		}
		
		for (int i=0; i<arr.length; i++) {		//�� �� �ڵ�� ����. ���� �� ������ Ȯ���ϱ� ���� �ѹ� �� ���
			System.out.print(arr[i] + "\t");	
			if((i+1) % 5 == 0) {		
				System.out.println();
			}
		}
		System.out.println();
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("1~100�� ��: " + sum);
	}
}
