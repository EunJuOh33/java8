package Day0331;

import java.util.Scanner;

public class EX4 {
	public static void main(String[] args) {
		/* �Է��� ���ڿ��� �Ųٷ� ������ ����ϴ� ���α׷� */
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ���ڿ��� �Է��ϼ���.: ");
		String str = sc.nextLine();
		
		//���ڿ� ������
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		
		//���
		System.out.println("�Է��� ���ڿ� : " + str);
		System.out.println("�Ųٷ� �ٲ� ���ڿ� : " + sb);
		sc.close();
	}
}
