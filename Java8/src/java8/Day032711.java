package java8;

import java.util.Scanner;

public class Day032711 {
	public static void main(String[] args) {
		/* Ű����κ��� ��ǰ�� �ܰ��� ������ �Է¹޾�
		 * ���� �ݾװ� �������� ����Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * �� ��ǰ ���Աݾ��� 50���� �̻��� �� 30%�� �����ϰ�,
		 * �� ��ǰ ���Աݾ��� 100���� �̻��� �� 40%�� �����Ѵ�.
		 * ���� �ݾ��� "���ε� ��ǰ �ܰ�" * "����"
		 * ��� ���� : ��ǰ �ܰ�, ��ǰ ����, ���� �ݾ�, ������
		 */
		int price = 0, amount = 0, res1 = 0, sale = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ǰ�� �ܰ��� ���Դϱ�? : ");
		price = sc.nextInt();
		System.out.print("�� ���� �����ϼ̽��ϱ�? : ");
		amount = sc.nextInt();
		System.out.println("��ǰ�� �ܰ� : " + price + "��");
		System.out.println("��ǰ�� ���� : " + amount + "��");
		
		//���ε� ��ǰ �ܰ� ���
		res1 = price * amount;
		if(res1 >= 1_000_000) {
			price *= 0.6;
			sale = 40;
		} else if(res1 >= 500_000) {
			price *= 0.7;
			sale = 30;
		} else {		//else�κ��� ���� ������ ������ �̸�int sale = 0;���� �ʱ�ȭ���Ѿ� �Ѵ�.
			sale = 0;
		}
		

		System.out.println("������ : " + sale + "% ");
		System.out.print("���� �ݾ� : " + amount + "��");
		
		sc.close();
	}
}
