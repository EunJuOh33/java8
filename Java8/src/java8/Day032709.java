package java8;

import java.util.Scanner;

public class Day032709 {
	public static void main(String[] args) {
		/*
		 * 2���� ������ �Է¹޾Ƽ� ���� ���(while �Ǵ�  do~while ���)
		 * ���� ���� 500�� �ʰ��ϸ� ���α׷� ����
		 */
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("���� �� ���� �Է��Ͻÿ�.: ");
			int num1 = sc. nextInt();
			int num2 = sc. nextInt();
			int res = num1 * num2;
			System.out.println(num1 + "x" + num2 + "=" + res);
			System.out.println();
			if(res > 500) {
				break;
			}
		}
		System.out.println("������� 500�� �ʰ��Ͽ� ���α׷��� �����մϴ�.");
		
		sc.close();
	}
}
