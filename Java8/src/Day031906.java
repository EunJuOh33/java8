import java.util.Random;

public class Day031906 {

	public static void main(String[] args) {
		Random rd = new Random();
		int now = rd.nextInt(4) + 9;
		System.out.println("현재 시간은 " + now + "시입니다.");
		System.out.println("남은 일과");
		
		switch(now) {
		case 9:
			System.out.println("9시에는 출근을 합니다.");
		case 10:
			System.out.println("10시에는 회의를 합니다.");
		case 11:
			System.out.println("11시에는 업무를 처리합니다.");
		case 12:
			System.out.println("12시에는 점심 을 먹습니다.");
		}
		
		System.out.println(now);
	}
}
