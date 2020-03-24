package java8;

import java.util.Random;
import java.util.Scanner;

public class Day032403 {
	public static void main(String[] args) {
		/* ������ ����ؼ� ������ ������ ����ϰ� ���� �Է��ϵ��� �ۼ��ϼ���. */
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int num1, num2, quiz, answer;
		
		Long startTime = System.currentTimeMillis();	//long������ ����غ���.
		for(int i = 0; i < 10; i++) {		// 10�� �ݺ�
			num1 = (int)(Math.random() * 8) + 2;	//(int)�� ��������ȯ
			num2 = rd.nextInt(9) + 1;
	
			quiz = num1 * num2;
			System.out.print(num1 + "x" + num2 + " = ");
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
	}
}
