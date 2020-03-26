package java8;

import java.util.Scanner;

public class Day032612 {
	public static void main(String[] args) {
		/* Ű����κ��� 5���� ������ �Է¹޾� �ִ밪�� ���Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�*/
		System.out.println("5���� ������ �Է¹޾� �ִ밪�� ���ϴ� ���α׷�");
		Scanner sc = new Scanner(System.in);
		
		/* ���� �Է¹ޱ�*/
		int[] arr = new int[5]; 
		for(int i=0; i<arr.length; i++) {
			System.out.print(i+1 + "��° ������ �Է��ϼ���.: ");
			arr[i] = sc.nextInt();
		}
		
		/* �ִ밪 ���ϱ� */
		int max = Integer.MIN_VALUE;
		for(int num:arr) {
			if(max < num) {
				max = num;
			}
		}
		System.out.print("�ִ� ���� " + max + "�Դϴ�.");
		
		sc.close();
	}
}
