import java.util.Scanner;

public class Day031908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("안녀아세요. 영남다방입니다.");
		System.out.print("음료를 주문해 주세요.");
		System.out.print("A. 아메리카노, C. 카푸치노, L. 카페라떼, M. 카페모카");
		System.out.print("입력 > ");
		String menu = sc.next();
		
		switch(menu) {
		case "a":
		case "A":
			System.out.println("아메리카노를 주문하셨습니다.");
			break;
		case "c":
		case "C":
			System.out.println("카푸치노를 주문하셨습니다.");
			break;
		case "l":
		case "L":
			System.out.println("카페라떼를 주문하셨습니다.");
			break;
		case "m":
		case "M":
			System.out.println("카페모카를 주문하셨습니다.");
			break;
		}
	}
}
