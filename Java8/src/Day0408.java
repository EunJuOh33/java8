package java_oh;

import java.util.Scanner;

public class Day0408 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���簢���� ���ο� ���� ���̸� �Է��ϼ���.");
		
		int w = sc.next();
		int h = sc.nextInt();
		
		int res1 = w * h;
		int res2 = 2 * (w + h);
		
		System.out.println("���簢���� ������ " + res1 + "�Դϴ�.");
		System.out.println("���簢���� �ѷ��� " + res2 + "�Դϴ�.");
	}
}
