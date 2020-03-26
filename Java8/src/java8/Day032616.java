package java8;

import java.util.Random;
import java.util.Scanner;

public class Day032616 {
	public static void main(String[] args) {
		/* ���� �߱� ���� �����
		* ���� �ڸ�, ���� ���� : ��Ʈ����ũ
		* �ٸ� �ڸ����� ���� ���ڰ� �ִٸ� : ball
		* ��Ʈ����ũ, ball �� �� ���ٸ� : out
		* �� ������ ����!
		*/
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("���� �߱������Դϴ�.");
		int[] com = new int[3];
		com[0] = rd.nextInt(9) + 1;
		
		/* ��ǻ�� */
		do {
			com[0] = rd.nextInt(9) + 1;
		} while(com[0] == com[1]);
		do {
			com[2] = rd.nextInt(9) + 1;
		} while(com[0] == com[2] || com[1] == com[2]);
		
		int strike = 0, ball = 0;
		
		
		int[] user = new int[3];
		for (int x = 0; x < 11; x++) {
		/* user �Է� �κ� */
		System.out.print("ù ��° ���� �Է��� �ּ���.(1~9): ");
		do {
			if(user[0] !=0) {
				System.out.println("������ �ʰ��Ͽ����ϴ�. �ٽ� �Է��� �ּ���.");
			}
			user[0] = sc.nextInt();
		} while(user[0] < 1 || user[0] > 9);
		
		do {	//ù ��° ���� �� ��° ���� �ߺ��� �����ֱ� ���� do while ���
			if(user[0] == user[1]) {
				System.out.println("������ ���ڴ� �Է��� �� �����ϴ�.");
			}
			System.out.print("�� ��° ���� �Է��� �ּ���.(1~9): ");
			do {
				if(user[1] !=0) {
					System.out.println("������ �ʰ��Ͽ����ϴ�. �ٽ� �Է��� �ּ���.");
				}
				user[1] = sc.nextInt();
			} while(user[1] < 1 || user[1] > 9);
		} while(user[0] == user[1]);
		
		do {
			if(user[0] == user[2] || user[1] == user[2]) {
				System.out.println("������ ���ڴ� �Է��� �� �����ϴ�.");
			}
			System.out.print("�� ��° ���� �Է��� �ּ���.(1~9): ");
			do {
				if(user[2] !=0) {
					System.out.println("������ �ʰ��Ͽ����ϴ�. �ٽ� �Է��� �ּ���.");
					}
					user[2] = sc.nextInt();
				} while(user[2] < 1 || user[2] > 9);
			} while (user[0] == user[2] || user[1] == user[2]);
	
			for (int i = 0; i <3; i++) {
				if (com[i] == user[i]) {
					strike++;
				}
			}
		
			if(com[0] == user[1] || com[0] == user[2]) {
				ball++;
			}	
			if(com[1] == user[0] || com[1] == user[2]) {
				ball++;
			}
			if(com[2] == user[0] || com[2] == user[1]) {
				ball++;
			}
			System.out.println(strike + "��Ʈ����ũ, " + ball + "��");
			if(strike == 3) {
				System.out.println("�����Դϴ�. ������ �����մϴ�.");
				System.exit(0);
			}
			strike = ball = 0;
			user = new int[3];
		}
		sc.close();
	}
}
