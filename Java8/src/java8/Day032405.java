package java8;

import java.util.Scanner;

public class Day032405 {
	public static void main(String[] args) {
		/* ������ ���� 10ȸ �Ϸ�� ���� �ð��� ����ϼ���. */
		Scanner sc = new Scanner(System.in);	//�Է��� for�� �ۿ��� �޴´�.
		int num1, num2, quiz, answer;
		
		Long startTime = System.currentTimeMillis();
		for(int i = 0; i < 10; i++) {		// 10�� �ݺ�
			num1 = (int)(Math.random() * 8) + 2;	// (int)�� ��������ȯ.
			num2 = (int)(Math.random() * 9) + 1;	// (int)(Math.random() * 8) + 2; ���� �ǹ�
			
			quiz = num1 * num2;
			System.out.print((i + 1) + ": " + num1 + "x" + num2 + " = ");
			answer = sc.nextInt();
			
			if(quiz == answer) {
				System.out.println("�����Դϴ�.");
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�. ������ �����մϴ�.");
				System.exit(0);		// Ʋ���� �� ����.
			}
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("[���� ���� �ð�]");
		System.out.println(endTime - startTime + " ms");
		sc.close();
	}
}
