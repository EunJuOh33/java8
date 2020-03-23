package java8;
import java.util.Scanner;

public class Day032009 {

	public static void main(String[] args) {
		String ga = "����";
		String ba = "����";
		String bo = "��";
		String user = "";
		String com = "";
		Scanner sc = new Scanner(System.in);
		int score = 0;
		int life = 3;
		
		
		while (true) {
			/* ��� �Է� */
			System.out.print("����, ����, �� �� �ϳ��� �����ϼ���. ");
			System.out.print("<����=a, ����=b, ��=c, ����=q> : ");
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
				case "Q":
				case "q":
					user = "quit";
					break;	
				default:
					user = "error";
			}
		
			if(user == "error") {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				System.exit(0);
			} else if(user == "quit") {
				System.out.println("���Ḧ �����ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
				break;
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
		
			if((user.equals(bo) && com.equals(ba)) || (user.equals(ga) && com.equals(bo)) 
					|| (user.equals(ba) && com.equals(ga))) {
				System.out.print("��� ��! ���:" + user + ", ��ǻ��:" + com);
				score += 100;
			} else if(user.equals(com)) {
				System.out.println("�����ϴ� ! ���:" + user + ", ��ǻ��:" + com);
				score += 10;
			} else {
				System.out.println("��ǻ�� �� ! ���:" + user + ", ��ǻ��:" + com);
				life -= 1;
			}
			System.out.println("���� ����: " + score + ", ���� ������: " + life);
			System.out.println();
			
			if(life==0) {
				System.out.println("������ ����Ǿ����ϴ�.");
				break;
			}
		}
		sc.close();
	}
}
