package Day0414;

import java.util.Date;

public class PrintfFormatEx {
	public static void main(String[] args) {
		int num = 10;
		double log = Math.log(num);
		System.out.format("log(%d) : %+10.6f %n", num, log);	// %+10.6f -> �Ҽ��� 6�ڸ� ���ļ� 10�ڸ� ���
																// f�� ���� ��
		
		Date today = new Date();
		System.out.printf("���� ��¥ : %tY �� %tm �� %td �� \n", today, today, today);	//
		System.out.printf("���� ��¥ : %1$tY �� %1$tm �� %1$td �� \n", today);
		System.out.printf("���� �ð� : %1$tH �� %1$tM �� %1$tS �� \n", today);
		System.out.format("���� ��¥ : %tY �� %tm �� %td �� \n", today, today, today);
	}
}
