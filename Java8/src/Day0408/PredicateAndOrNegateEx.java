package Day0408;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateEx {
	public static void main(String[] args) {
		//2�� ��� �˻�
		IntPredicate predicateA = a -> a%2 == 0;
		
		//3�� ��� �˻�
		IntPredicate predicateB = (a) -> a%3 == 0;
		
		IntPredicate predicateAB;
		boolean result;
		
		//and()
		predicateAB = predicateA.and(predicateB);
		result = predicateAB.test(9);
		System.out.println("9�� 2�� 3�� ����Դϱ�? "+ result);	//false
		
		//or()
		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(9);
		System.out.println("9�� 2 �Ǵ� 3�� ����Դϱ�? " + result);	//�� �� �ϳ��� true�� true.
		
		//negate()
		predicateAB = predicateA.negate();
		result = predicateAB.test(9);
		System.out.println("9�� Ȧ���Դϱ�? "+ result);	//false�� negate�� �ٲ㼭 true.
	}
}
