package java8;

public class Day032401 {
	public static void main(String[] args) {
		/* 1 ~ 100 출력 */
		for(int i=1; i<=100; i++) {
			System.out.println(i);
		}
		
		/* 1 ~100 중에 3과 5의 공배수의 합은 얼마인가요? */
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if((i%5 ==0) && (i%3 ==0)) {
				sum += i;
			}
		}
		System.out.println("3과 5의 공배수의 합: " + sum);
		
		/* 1 ~ 100 중에 짝수는 더하고 홀수는 뺀 결과를 출력하세요. */
		int sum1 = 0;
		int sum2 = 0;
		for(int i=1; i<=100; i++) {
			if(i%2 ==0) {
				sum1 += i;
			} else {
				sum2 += i;
			}
		}
		System.out.println("짝수는 더하고 홀수는 뺀 결과: " + (sum1 - sum2));
		
		sum = 0;
		for(int i=1; i<=100; i++) {
			if(i % 2 == 0) {
				sum += i;
			} else {
				sum -= i;
			}
		}
		System.out.println(sum);
	}
}
