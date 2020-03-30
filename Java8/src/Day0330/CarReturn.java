package Day0330;

public class CarReturn {
	// 필드
	int gas;
	
	// 생성자 - 생략되면 기본 생성자 생성
	
	
	// 메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {	//가스가 떨어졌는지 묻는다.
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;	//false를 리턴
		}
		System.out.println("gas가 있습니다.");
		return true;	// true를 리턴
	}
	
	void run() {
		while (true) {	//무한반복문
			if(gas > 0) {
				System.out.println("달립니다. (gas잔량: " + gas + ")");
				gas -= 1;	
			} else {
				System.out.println("멈춥니다. (gas잔량: " + gas + ")");
				System.out.println("임시 출력");
				return;	//return은 메서드를 멈추게 하는 기능이 들어가있다.
//				System.out.println("리턴 후 출력");		//빨간 줄. return아래 쪽에는 다른 코드가 들어갈 수 없다.
			}
		}
	}
}
