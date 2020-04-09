package Day0409;

public class User1 extends Thread {
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1");	//Thread의 이름을 바꿔준다.
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(100);
	}

}
