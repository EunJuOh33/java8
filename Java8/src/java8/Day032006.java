package java8;
import java.util.Scanner;

public class Day032006 {

	public static void main(String[] args) {
		/*
		 * �� ���� ������� �Է¹޾Ƽ� ȭ�鿡 ����ϴ� ���α׷��� �ۼ��ϼ���.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ����Ͻðڽ��ϱ�?(2~9����): ");
		int num = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			for(int j=num; j<=num; j++) {
				System.out.print(j + "x" + i + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
		sc.close();
	}
}
