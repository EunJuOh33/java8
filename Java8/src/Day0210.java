
public class Day0210 {

	public static void main(String[] args) {
		double apple = 1.0;
		double unit = 0.1;
		System.out.println("사과 한 개를 10조각으로 나눠서");
		System.out.println("7조각을 먹었습니다.");
		System.out.println("남은 조각은 몇 조각일까요?");
		double result = apple - unit * 7;
		System.out.println(result);
		//실수는 정확한 연산이 되지 않습니다. 부동소수점으로 계산하기 때문.
		//그래서 연산을 할 때는 정수 연산을 하고 마지막에 실수로 표현해야 한다.
		
		double result2 = 100000000000000.0 + 1.0;
		System.out.println(result2);
		
		int apple2 = 1;
		double unit2 = 1;
		double result3 = (apple2 * 10 - unit2 * 7) / 10;
		System.out.println(result3);
	}
}
