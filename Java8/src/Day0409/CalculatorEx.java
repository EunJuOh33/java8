package Day0409;

public class CalculatorEx {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		User1 user1 = new User1();
		User2 user2 = new User2();
		
		user1.setCalculator(calc);
		user2.setCalculator(calc);
		user1.start();
		user2.start();
		//User2: 50   User1: 50
	}
}
