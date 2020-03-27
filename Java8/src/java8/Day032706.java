package java8;

import java.util.Random;
import java.util.Scanner;

public class Day032706 {
	public static void main(String[] args) {
		/*
		 * �ζ� ��ȣ ������ �ۼ�
		 * 1. 6���� ������ ����(1~45)�� �迭�� �Է��ϼ���.
		 * 2. �ߺ����� �ʵ��� �ۼ��ϼ���.
		 */
/*		// ������ ����(1~45)�� �迭�� �Է�
 *		int[] lotto = new int[6];
 *		Random rd = new Random();
 *		for(int i=0; i<lotto.length; i++) {
 *			lotto[i] = rd.nextInt(45) + 1;
 *			System.out.println(lotto[i]);
 *		}
 */	
		
/*		// �ߺ����� �ʵ��� ����� ���(1) - �ʹ� ���
 *		lotto[0] = rd.nextInt(45) + 1;
 *		do {
 *			lotto[1] = rd.nextInt(45) + 1;
 *		} while(lotto[0] == lotto[1]);
 *		do {
 *			lotto[2] = rd.nextInt(45) + 1;
 *		} while(lotto[2] == lotto[0] || lotto[2] == lotto[1]);
 *		.
 *		.
 *		.
 */
		
		// �ߺ����� �ʵ��� ����� ���(2)
		
		int[] lotto = new int[6];
		Random rd = new Random();
		System.out.println("�ζ� ������");
		System.out.print("�� ������ �����Ͻðڽ��ϱ�?");
		Scanner sc = new Scanner(System.in);
		int game = sc.nextInt();
		
		for(int x=0; x < game; x++) {
			/* �ζ� ���� ����*/
			for(int i=0; i<lotto.length; i++) {
				lotto[i] = rd.nextInt(45) + 1;
				for(int j=0; j<i; j++) {
					if(lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}
		
			/* ���������� ����ؼ� �迭�� ������������ �����ϼ���. */
			for(int i=0; i<lotto.length; i++) {
				for(int j=0; j<lotto.length -1; j++) {
					if(lotto[i] < lotto[j]) {
						int temp = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = temp;
					}
				}
			}
		
			for(int i=0; i<lotto.length; i++) {
				System.out.print(lotto[i] + " ");
			}
			System.out.println();
			
			sc.close();
			/* �ζ� ���� �� */
		}
	}
}
