import java.util.Scanner;

public class Day031909 {

	public static void main(String[] args) {
		String ga = "����";
		String ba = "����";
		String bo = "��";
		String user = "";
		String com = "";
		
		/* ��� �Է� */
		Scanner sc = new Scanner(System.in);
		System.out.print("����, ����, �� �� �ϳ��� �����ϼ���. ");
		System.out.print("<����=a, ����=b, ��=c> : ");
		user = sc.next();
		
		switch(user) {
			case "a":
			case "A":
				user = ga;
				break;
			case "B":
			case "b":
				user = ba;
				break;
			case "C":
			case "c":
				user = bo;
				break;
			default:
				user = "error";
		}
		
		if(user == "error") {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
		
		/* ��ǻ�� ���� */
		int number = (int)(Math.random() * 3);
		switch(number) {
			case 0:
				com = ga;
				break;
			case 1:
				com = ba;
				break;
			case 2:
				com = bo;
				break;
		}
		
		if((user == bo && com == ba) || (user == ga && com == bo) || (user == ba && com == ga)) {
			System.out.print("��� ��! ���:" + user + ", ��ǻ��:" + com);
		} else if(user == com) {
			System.out.println("�����ϴ� ! ���:" + user + ", ��ǻ��:" + com);
		} else {
			System.out.println("��ǻ�� �� ! ���:" + user + ", ��ǻ��:" + com);
		}
	}
}
