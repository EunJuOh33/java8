package java8;

import java.util.Scanner;

public class Day032406 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 2개를 차례대로 입력하세요.: ");
		int a = sc.nextInt();	//입력할 때는 공백을 사용해도 되고, 엔터를 사용해도 된다.
		int b = sc.nextInt();
		// a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
		if(!(a >= -10_000_000 && a <= 10_000_000)) {
			System.out.print("a값의 입력 범위를 초과하였습니다.");
			System.exit(0);
		}
		if(!(a >= -10_000_000 && a <= 10_000_000)) {
			System.out.print("b값의 입력 범위를 초과하였습니다.");
			System.exit(0);
		}
		
		int min = 0, max = 0, sum = 0;
		if(a > b) {
			max = a;
			min = b;
		} else if (a == b) {
			System.out.println("a부터 b까지의 합: " + a);
			System.exit(0);
		} else {
			min = a;
			max = b;
		}
		
		for(int i=min; i<=max; i++) {
			sum += i;
		}
		
		System.out.print("a부터 b까지의 합: " + sum);
		sc.close();
	}
}
