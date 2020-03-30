package Day0330;

public class CalculatorEx {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.powerOn();
		int res1 = calc.plus(10, 20);
		System.out.println(res1);	//30
		
		byte num1 = 10;	//byte는 127까지 사용할 수 있다.
						//byte형은 int로 자동형변환
		byte num2 = 3;
		double res2 = calc.divide(num1, num2);
		System.out.println(res2);	//3.333...35
		
		long num3 = 100;
		long num4 = 30;
//		double res3 = calc.divide(num3, num4);	//오류. long은 int에 넣기 위해서 강제형변환이 필요.
		double res3 = calc.divide((int)num3, (int)num4);	//long은 int에 넣기 위해서 강제형변환이 필요.
		double res4 = calc.plus(num3, num4);	//plus중복 정의에서 형변환을 해주었기 때문에 여기서 강제형변환 해줄필요 없다.
		System.out.println(res3);	//3.333...35
		System.out.println(res4);	//10130.0
		calc.powerOff();
	}
}
