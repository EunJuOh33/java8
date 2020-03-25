package java8;

import java.util.Scanner;

public class Day032408 {
	public static void main(String[] args) {
		/*
		 * 1~100 �߿� �����ϰ� ������ �����Ѵ�.
		 * �Է��� ���� ���亸�� ũ�� "Up"
		 * �Է��� ���� ���亸�� ������ "Down"���� ����մϴ�.
		 * �ִ� Ƚ���� 10ȸ�� ����.
		 * ������ ��Ҹ� ���� ������ ����մϴ�.
		 */
		/* ���� ���� */
		int num = (int)(Math.random() * 100) + 1;	// 1~100���� ���� ����
		int inputNum = 0;	
		int cnt = 0;	//�� ������ ������� �˰�ʹ�.
		Scanner sc = new Scanner(System.in);
		
		/* ���� ���� */
		long startTime = System.currentTimeMillis();
		while(true) {
			/* ���� �Է� */
			do {
				if(inputNum != 0) {
					System.out.print("�߸��Է��ϼ̽��ϴ�.");
				}
				System.out.print("���ڸ� �Է��� �ּ���(1~100): ");
				inputNum = sc.nextInt();
			} while(inputNum < 1 || inputNum > 100);
			
			/* ��� ��� */
			cnt++;
			if(num == inputNum) {
				System.out.println("�����Դϴ�." + cnt + "ȸ �Է��Ͽ����ϴ�.");
				break;
			} else if(num > inputNum ) {
				System.out.println("Up!!" + cnt + "ȸ �Է��Ͽ����ϴ�.");
			} else {
				System.out.println("Down!!" + cnt + "ȸ �Է��Ͽ����ϴ�.");
			}
			
			if(cnt == 10) {
				System.out.println("���������� 0���Դϴ�. ������ �����մϴ�.");
				System.exit(0);
			}
		}
		
		/* ���� ��� */
		long endTime = System.currentTimeMillis();
		long playTime = (endTime - startTime) / 1000;	//�и��� -> ��
		double score = (60 - playTime) / 0.6;	// 60�� 60��(1��) ���� ���� ���� ������� �ȴ�.
		System.out.println("����������" + score + "���Դϴ�. ������ �����մϴ�.");
		
		sc.close();
	}
}
