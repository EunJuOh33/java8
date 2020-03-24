package java8;

import java.util.Scanner;

public class Day032406 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 2���� ���ʴ�� �Է��ϼ���.: ");
		int a = sc.nextInt();	//�Է��� ���� ������ ����ص� �ǰ�, ���͸� ����ص� �ȴ�.
		int b = sc.nextInt();
		// a�� b�� -10,000,000 �̻� 10,000,000 ������ �����Դϴ�.
		if(!(a >= -10_000_000 && a <= 10_000_000)) {
			System.out.print("a���� �Է� ������ �ʰ��Ͽ����ϴ�.");
			System.exit(0);
		}
		if(!(a >= -10_000_000 && a <= 10_000_000)) {
			System.out.print("b���� �Է� ������ �ʰ��Ͽ����ϴ�.");
			System.exit(0);
		}
		
		int min = 0, max = 0, sum = 0;
		if(a > b) {
			max = a;
			min = b;
		} else if (a == b) {
			System.out.println("a���� b������ ��: " + a);
			System.exit(0);
		} else {
			min = a;
			max = b;
		}
		
		for(int i=min; i<=max; i++) {
			sum += i;
		}
		
		System.out.print("a���� b������ ��: " + sum);
		sc.close();
	}
}
