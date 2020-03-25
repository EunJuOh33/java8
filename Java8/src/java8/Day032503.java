package java8;

import java.util.Scanner;

public class Day032503 {
	public static void main(String[] args) {
		/* ������ ������ �ۼ��ϼ���. */
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���.");
		int subScore = 0;	//������ ������ �����ϱ� ���� �������.
		
		long startTime = System.currentTimeMillis();
		for(int i=1; i<=9; i++) {
			int num1 = (int)(Math.random() * 8) + 2;	// 2 ~ 9����
			int num2 = (int)(Math.random() * 9) + 1;	// 1 ~ 9����
			System.out.print(num1 + "X" + num2 + "=");
			int answer = sc.nextInt();
			
			if(num1 * num2 == answer) {
				System.out.println("�����Դϴ�.");
			} else {
				subScore += 5;
				System.out.println("�����Դϴ�. " + subScore + "�� �����Դϴ�.");
			}
		}
		long endTime = System.currentTimeMillis();
		long playTime = endTime - startTime / 1000;	//�и��� -> ��
		long score = 200 - playTime - subScore; 
		
		if(score > 100) {
			score = 100;
		} else if(score < 0) {
			score = 0;
		}
		System.out.println("���� ������ " + score + "�Դϴ�.");
		
		sc.close();
	}
}
