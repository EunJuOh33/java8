package Baekjoon;

import java.util.Scanner;

public class No004 {
	public static void main(String[] args) {
		/* 45�� ���� �˶� �����ϱ� */
		
		//����̰� ������ �˶� �ð� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		//�߸��� �Է�
		if((H<0 || H>23) || (M<0 || M>59)) {
			System.out.print("�߸��Է��ϼ̽��ϴ�.");
			System.exit(0);
		}
		
		//â������ ������� �˶� �ð� ��ġ��
		int CM = M - 45;
		int CH = H;
		if(CM <0) {
			CM += 60;
			CH--;
			if(CH<0) {
				CH += 24;
			}
		}	
		System.out.print(CH + " " + CM);
		
		sc.close();
	}
}
