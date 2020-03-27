package java8;

import java.util.Scanner;

public class Day032710 {
	public static void main(String[] args) {
		/*
		 * �⼮20%, ����20%, �߰����30%, �⸻���30%�Ͽ� 100�� ����
		 * �ִ����� : �⼮20, ����20, �߰����30, �⸻���30
		 * ���� : 90~100:A, 80~89:B, 70~79:C, 60~69:D, 0~59:F
		 */
		int a = 0, b = 0, c = 0, d = 0; 
		char grade = 0;
		Scanner sc = new Scanner(System.in);

		
		do {
			if(a < 0 || a > 100) {
				System.out.println("�Է� ������ �ʰ��Ͽ����ϴ�.");
			}
			System.out.print("�⼮ ������ �� �� �Դϱ�? : ");
			a = sc.nextInt();
		} while (a < 0 || a > 100);
		
		do {
			if(b < 0 || b > 100) {
				System.out.println("�Է� ������ �ʰ��Ͽ����ϴ�.");
			}
			System.out.print("���� ������ �� �� �Դϱ�? : ");
			b = sc.nextInt();
		} while (b < 0 || b > 100);
		
		do {
			if(c < 0 || c > 100) {
				System.out.println("�Է� ������ �ʰ��Ͽ����ϴ�.");
			}
			System.out.print("�߰���� ������ �� �� �Դϱ�? : ");
			c = sc.nextInt();
		} while (c < 0 || c > 100);
		
		do {
			if(d < 0 || d > 100) {
				System.out.println("�Է� ������ �ʰ��Ͽ����ϴ�.");
			}
			System.out.print("�⸻��� ������ �� �� �Դϱ�? : ");
			d = sc.nextInt();
		} while (d < 0 || d > 100);
		
		
		int score = (int)(a / 100 * 20 + b / 100 * 20 + c / 100 * 30 + d / 100 * 30);
		System.out.print("�� ���� " + score + "�Դϴ�.");
		
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >= 70) {
			grade = 'D';
		} else if(score >= 60) {
			grade = 'F';
		}
		System.out.println("����� ������ " + grade + "�Դϴ�.");
		
		sc.close();
	}
}
