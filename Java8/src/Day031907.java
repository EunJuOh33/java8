import java.util.Scanner;

public class Day031907 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ����� �Է��� �ּ���: ");
		String grade = sc.next();
		
		switch(grade) {
		case "s":
		case "S":
			System.out.println("����� vip�Դϴ�.");
			break;
		case "a":
		case "A":
			System.out.println("����� ��� ���Դϴ�.");
			break;
		case "b":
		case "B":
			System.out.println("����� ��� ���Դϴ�.");
			break;
		case "c":
		case "C":
			System.out.println("����� vip�Դϴ�.");
			break;
		case "d":
		case "D":
			System.out.println("����� vip�Դϴ�.");
			break;
		case "e":
		case "E":
			System.out.println("����� vip�Դϴ�.");
			break;
		case "f":
		case "F":
			System.out.println("����� vip�Դϴ�.");
			break;
		}
	}
}
