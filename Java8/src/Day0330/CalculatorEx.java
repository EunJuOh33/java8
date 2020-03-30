package Day0330;

public class CalculatorEx {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.powerOn();
		int res1 = calc.plus(10, 20);
		System.out.println(res1);	//30
		
		byte num1 = 10;	//byte�� 127���� ����� �� �ִ�.
						//byte���� int�� �ڵ�����ȯ
		byte num2 = 3;
		double res2 = calc.divide(num1, num2);
		System.out.println(res2);	//3.333...35
		
		long num3 = 100;
		long num4 = 30;
//		double res3 = calc.divide(num3, num4);	//����. long�� int�� �ֱ� ���ؼ� ��������ȯ�� �ʿ�.
		double res3 = calc.divide((int)num3, (int)num4);	//long�� int�� �ֱ� ���ؼ� ��������ȯ�� �ʿ�.
		double res4 = calc.plus(num3, num4);	//plus�ߺ� ���ǿ��� ����ȯ�� ���־��� ������ ���⼭ ��������ȯ �����ʿ� ����.
		System.out.println(res3);	//3.333...35
		System.out.println(res4);	//10130.0
		calc.powerOff();
	}
}
