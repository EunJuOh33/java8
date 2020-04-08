package Day0408;

import java.util.function.IntBinaryOperator;

public class MethodReferenceEx {
	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		//�͸�����ü
		operator = new IntBinaryOperator() {
			
			@Override
			public int applyAsInt(int left, int right) {
				return Calculator.staticMethod(left, right);
			}
		};
		
		int result = operator.applyAsInt(10, 20);
		System.out.println(result);	//30
		
		
		//���ٽ� operator
		operator = (int left, int right) -> {
			return Calculator.staticMethod(left, right);
		};
		
		operator = (x, y) -> Calculator.staticMethod(x, y);
		result = operator.applyAsInt(10, 20);
		System.out.println(result);	//30
		
		
		//���� �޼ҵ� ����
		operator = Calculator::staticMethod;
		result = operator.applyAsInt(10, 20);
		System.out.println(result);	//30
		
		
		//�ν��Ͻ� �޼ҵ� ����
		Calculator calc = new Calculator();
		
		operator = calc::instanceMethod;
//		operator = Calculator::instanceMethod;	//�ν��Ͻ� �޼ҵ�� Ŭ���������� ȣ�� �Ұ���
		result = operator.applyAsInt(10, 20);
		System.out.println(result);
	}
}
