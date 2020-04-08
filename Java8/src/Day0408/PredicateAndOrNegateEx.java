package Day0408;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateEx {
	public static void main(String[] args) {
		//2의 배수 검사
		IntPredicate predicateA = a -> a%2 == 0;
		
		//3의 배수 검사
		IntPredicate predicateB = (a) -> a%3 == 0;
		
		IntPredicate predicateAB;
		boolean result;
		
		//and()
		predicateAB = predicateA.and(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2와 3의 배수입니까? "+ result);	//false
		
		//or()
		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2 또는 3의 배수입니까? " + result);	//둘 중 하나만 true면 true.
		
		//negate()
		predicateAB = predicateA.negate();
		result = predicateAB.test(9);
		System.out.println("9는 홀수입니까? "+ result);	//false를 negate로 바꿔서 true.
	}
}
