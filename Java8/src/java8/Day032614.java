package java8;

import java.util.Scanner;

public class Day032614 {
	public static void main(String[] args) {
		/*��� 1�� 2000�� �ֹ�:1
		* ������ 1�κ� 2000�� �ֹ�:1
		* ���� 1�� 500�� �ֹ�:4
		* ���� 1�κ� 2000�� �ֹ�:1
		* ���� ����
		*/
		Scanner sc = new Scanner(System.in);
		final int kimbab = 2000;	//final�� ���̸� ���� �Ұ�
		final int dduk = 2000;
		final int odeng = 500;
		final int sundae = 2000;
		int a, b, c, d;
		
		System.out.println("�����н��Դϴ�. �޴��� ������ �����ϴ�.");
		System.out.println("��� 1�� : 2000��, ������ 1�κ� : 2000��,");
		System.out.println("���� 1�� : 500��, ���� 1�κ� : 2000��");
		System.out.println();
		
		System.out.print("����� �� �� �����Ͻðڽ��ϱ�? : ");
		a = sc.nextInt();
		System.out.print("�����̴� �� �� �����Ͻðڽ��ϱ�? : ");
		b = sc.nextInt();
		System.out.print("������ �� �� �����Ͻðڽ��ϱ�? : ");
		c = sc.nextInt();
		System.out.print("����� �� �� �����Ͻðڽ��ϱ�? : ");
		d = sc.nextInt();
		System.out.println();
		
		System.out.println("����� " + a + "�κ� �ֹ��ϼ̽��ϴ�.");
		System.out.println("��� : " + kimbab * a);
		System.out.println("�����̴� " + b + "�κ� �ֹ��ϼ̽��ϴ�.");
		System.out.println("������ : " + dduk * b);
		System.out.println("���� " + c + "�κ� �ֹ��ϼ̽��ϴ�.");
		System.out.println("���� : " + odeng * c);
		System.out.println("����� " + d + "�κ� �ֹ��ϼ̽��ϴ�.");
		System.out.println("���� : " + sundae * d);
		System.out.println();
		
		System.out.println("�� �ݾ� : " + (kimbab * a + dduk * b + odeng * c + sundae * d));
		sc.close();
	}
}
