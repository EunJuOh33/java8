package java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Day032613 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		/*Ű���带 ���Ͽ� ������ ���� 10���� �Է��Ͽ� ������������ �����ϰ� �������� �հ� ����� ���Ͽ� ����Ѵ�.*/
		int r[] = new int[10];
		int number;
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������ 10�� �Է��ϼ���! : ");
		for(int x=0; x<r.length; x++) {
			r[x] = Integer.parseInt(inbr.readLine());
		}
		System.out.print("�Է� ������ �� : ");
		for(int x=0; x<r.length; x++) {
			System.out.print(r[x] + "..");
		}
		System.out.println();
		
		//�������� ���� ����
//		for(int i=0; i<r.length; i++) {	//��������
//			for(int j=0; j<r.length; j++) {
//				if(r[i] < r[j]) {	//r[i] > r[j] �̷��� ���� �ݴ�� �ϸ� ��������.
//					int temp = r[i];	//swap �ڵ�
//					r[i] = r[j];
//					r[j] = temp;
//				}
//			}
//		}
		Arrays.sort(r);//Arrays Ŭ�������� �����ϴ� ���� �޼���
		//�������� ���� ��
		
		System.out.print("�������� ������ �� : ");
		for(int x=0; x<r.length; x++) {
			System.out.print(r[x] + "..");
		}
		System.out.println();
		System.out.print("�հ� : ");
		int sum = 0;
		for(int x=0; x<r.length; x++) {
			sum = sum + r[x];
		}
		System.out.println(sum);
		System.out.println("��� : " + (sum / r.length));
	}
}