package Day0330;

public class Calculator {
	//메소드
		void powerOn() {	//void - 리턴값이 없다는 뜻
			System.out.println("전원을 켭니다.");
	}
		
	int plus(int x, int y) {	//int라서 반드시 리턴 값이 있어야한다.
		int result = x + y;
		return result;
	}
	
	int plus(long x, long y) {	//중복 정의
		int result = (int)x + (int)y + 10000;
		return result;
	}
	
	double divide(int x, int y) {		//double을 반환하는 divide라는 메서드
		double result = (double) x / y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
