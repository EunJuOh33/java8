package java8;

import java.util.Scanner;

public class Day032707 {
	public static void main(String[] args) {
		/* Ű����κ��� �� ���� ������ �Է¹޴´�.
		 * Ű����κ��� ���� ������ 5�� ����� ������ ���� ���Ͽ�
		 * ȭ�鿡 ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ��³��� : �Է� ��, 5�� ����� ����, 5�� ����� ��
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� ���� �Է��Ͻÿ�.: ");
		int num = sc.nextInt();
		int sum = 0; 
		int cnt = 0;
		
		for(int i=1; i<=num; i++) {
			if(i % 5 == 0) {		// ���� i=0;���� �ߴٸ� ��������.
				cnt++;
				sum += i;
			}
		}
		
		System.out.println("�Է� ��: " + num);
		System.out.println("5�� ����� ����: " + cnt);
		System.out.println("5�� ����� ��: " + sum);
		
		sc.close();
	}
}
