package java8;

import java.util.Scanner;

public class Day032408 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �����ּ���.: ");
		int a = sc.nextInt();
		
		int num1 = (int)Math.random();
		
		if(a < num1) {
			System.out.print("�� ���� �����Դϴ�.");
		} else if(a > num1) {
			System.out.print("�� ���� �����Դϴ�.");
		} else {
			System.out.print("�����Դϴ�!");
		}
		sc.close();
	}
}
