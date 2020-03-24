package java8;

import java.util.Scanner;

public class Day032407 {
	public static void main(String[] args) {
		/*
		 * ���� : �� ���� �Է¹޾� �� ���� �ִ������� �ּ� ������� ��ȯ�ϴ� �Լ��� �ϼ��� ���ÿ�.
		 * 3 12 => [3, 12]
		 * 2 5 => [1, 10]
		 * 
		 * ��Ʈ : �� ���� ���� �ִ� ����� x �ּ� ������̴�.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� �Է��� �ּ���.: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res1 = 0, res2 = 0;	//�ּҰ������ �ִ�����
		
		for(int i=1; i<= Integer.MAX_VALUE; i++) {
			if(i % a == 0 && i % b == 0) {
				res1 = i;
				break;
			}
		}
		res2 = a * b / res1;
		System.out.println("�ּ� �����: " + res1 + " ,�ִ� �����: " + res2);
		sc.close();
	}
}
