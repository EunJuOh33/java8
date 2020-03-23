package java8;

public class Day032314 {
	public static void main(String[] args) {
		/* 1 ~ 10 중에 5의 배수의 합을 출력하세요. */
		int sum = 0;	// 평균적으로 합계를 sum이라고 적는다. 0으로 초기화.
		for(int i=1; i<=100; i++) {
			if(i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);	//1050
		
		
		/* 1 ~ 50 중에 3의 배수는 화면에 출력하세요. */
		for(int i=1; i<=50; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
		
		
		/* 1~ 50 중에 3의 배수의 총합과 개수를 출력하세요. */
		int cnt = 0;
		sum = 0;	// 위에서 sum을 썼기 때문에 중복선언으로 오류 발생. 
					// 이름을 다르게 해주거나 sum = 0; 0으로 초기화해서 사용해야 함.
		
		for(int i=1; i<=50; i++) {
			if(i % 3 == 0) {
				sum += i;
				cnt++;
			}
		}
		System.out.println("총합: " + sum + ", 개수: " + cnt);	//총합: 408, 개수: 16
	}
}
