import java.util.Scanner;

public class Day031908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ȳ�Ƽ���. �����ٹ��Դϴ�.");
		System.out.print("���Ḧ �ֹ��� �ּ���.");
		System.out.print("A. �Ƹ޸�ī��, C. īǪġ��, L. ī���, M. ī���ī");
		System.out.print("�Է� > ");
		String menu = sc.next();
		
		switch(menu) {
		case "a":
		case "A":
			System.out.println("�Ƹ޸�ī�븦 �ֹ��ϼ̽��ϴ�.");
			break;
		case "c":
		case "C":
			System.out.println("īǪġ�븦 �ֹ��ϼ̽��ϴ�.");
			break;
		case "l":
		case "L":
			System.out.println("ī��󶼸� �ֹ��ϼ̽��ϴ�.");
			break;
		case "m":
		case "M":
			System.out.println("ī���ī�� �ֹ��ϼ̽��ϴ�.");
			break;
		}
	}
}
