import java.util.Scanner;

public class Day031907 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 등급을 입력해 주세요: ");
		String grade = sc.next();
		
		switch(grade) {
		case "s":
		case "S":
			System.out.println("당신은 vip입니다.");
			break;
		case "a":
		case "A":
			System.out.println("당신은 우대 고객입니다.");
			break;
		case "b":
		case "B":
			System.out.println("당신은 우수 고객입니다.");
			break;
		case "c":
		case "C":
			System.out.println("당신은 vip입니다.");
			break;
		case "d":
		case "D":
			System.out.println("당신은 vip입니다.");
			break;
		case "e":
		case "E":
			System.out.println("당신은 vip입니다.");
			break;
		case "f":
		case "F":
			System.out.println("당신은 vip입니다.");
			break;
		}
	}
}
