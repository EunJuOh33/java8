package java8;
import java.util.Scanner;

public class Day032010 {

	public static void main(String[] args) {
		int intyear;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������  �Ǻ��� �⵵�� �Է��� �ּ���.: ");
		intyear = sc.nextInt();
		
		//���� �Ǻ�
		if((intyear % 4 == 0 && intyear % 100 != 0) || (intyear % 400 == 0)) {
			System.out.println(intyear + "���� �����̴�.");
		} else {
			System.out.println(intyear + "���� ������ �ƴϴ�.");
		}
	sc.close();	
	}
}
