package Baekjoon;

import java.util.Scanner;

public class No007 {
	/* 0�� �Էµ� ������ ���� �ݺ� */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = a + b;
			if(0 < a && b < 10) {
				System.out.println(sum);
			}
			if(a == 0 && b ==0) {
				break;
			}
		}
		sc.close();
	}	
}

