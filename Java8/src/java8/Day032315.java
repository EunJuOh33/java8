package java8;

import java.util.Scanner;

public class Day032315 {
	public static void main(String[] args) {
		/* �������� 2�ܺ��� 9�ܱ��� ����ϼ���. */
		
		System.out.println("������ ���");
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j + "x" + i + "=" + (i * j) + "\t");	// \t�� tap Ű�� ������ ���� ���� ȿ��
																		// ù �ٿ� 1x2, 1x3, 1x4 ... �̷��� ����.
			}
			System.out.println();
		}
		System.out.println();
		
		/* �� ���� ������� �Է¹޾Ƽ� ����� �ּ���. */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ����Ͻðڽ��ϱ�?: ");
		int num = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			for(int j=num; j<=num; j++) {
				System.out.print(j + "x" + i + "=" + (i * j) + "\t");
			}
		}
		sc.close();
	}
}
