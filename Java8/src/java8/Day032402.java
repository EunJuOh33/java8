package java8;

import java.util.Scanner;

public class Day032402 {
	public static void main(String[] args) {
		/* Hello, World 0 ~ Hello world 9 ���  */
		for(int i=0; i<10; i++) {
			System.out.println("Hello, world " + i);
		}
		System.out.println();	// �׳� �� �� ���� ���
		
		
		/* �� ������� �������Ѽ� Hello, world 9 ~ 0 ���*/
		for(int i=9; i>=0; i--) {
			System.out.println("Hello, world " + i);
		}
		
		
		/* @�� 5���� 7�� ����ϼ���. */
		for(int i=0; i<7; i++) {
			System.out.println("@@@@@");
		}
		System.out.println();
		
		
		/* ���� ��¹��� ��ø for������ �����ϼ���.*/
		for(int i=0; i<7; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("@");
			}
			System.out.println();	//�� �� @@@@@ ��� �� �� �� ���ٴ� �ǹ� 
		}
		System.out.println();
		
		
		/* ���� ��¹����� 2���� 4���� #�� �ǵ��� �����ϼ���. */
		for(int i=0; i<7; i++) {
			for(int j=0; j<5; j++) {
				if(i%2 == 0) {
					System.out.print("#");
				} else {
					System.out.print("@");
				}
			}System.out.println();
		}
		System.out.println();
		
		
		/* ���ڿ��� �Է¹޾Ƽ� for������ ����ϱ� */
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��� �ּ���.");
		System.out.println("�Է� > ");
		String str = sc.nextLine();		//���ڿ��� nextLine()
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
}
