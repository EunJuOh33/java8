package Day0408;

import java.util.function.IntBinaryOperator;

public class MethodReferenceEx {
	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		//익명구현객체
		operator = new IntBinaryOperator() {
			
			@Override
			public int applyAsInt(int left, int right) {
				return Calculator.staticMethod(left, right);
			}
		};
		
		int result = operator.applyAsInt(10, 20);
		System.out.println(result);	//30
		
		
		//람다식 operator
		operator = (int left, int right) -> {
			return Calculator.staticMethod(left, right);
		};
		
		operator = (x, y) -> Calculator.staticMethod(x, y);
		result = operator.applyAsInt(10, 20);
		System.out.println(result);	//30
		
		
		//정적 메소드 참조
		operator = Calculator::staticMethod;
		result = operator.applyAsInt(10, 20);
		System.out.println(result);	//30
		
		
		//인스턴스 메소드 참조
		Calculator calc = new Calculator();
		
		operator = calc::instanceMethod;
//		operator = Calculator::instanceMethod;	//인스턴스 메소드는 클래스명으로 호출 불가능
		result = operator.applyAsInt(10, 20);
		System.out.println(result);
	}
}
