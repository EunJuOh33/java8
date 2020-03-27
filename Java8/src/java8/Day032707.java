package java8;

import java.util.Scanner;

public class Day032707 {
	public static void main(String[] args) {
		/* 키보드로부터 한 개의 정수를 입력받는다.
		 * 키보드로부터 받은 정수로 5의 배수의 개수와 합을 구하여
		 * 화면에 출력하는 프로그램을 작성하시오.
		 * 출력내용 : 입력 값, 5의 배수의 개수, 5의 배수의 합
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 한 개를 입력하시오.: ");
		int num = sc.nextInt();
		int sum = 0; 
		int cnt = 0;
		
		for(int i=1; i<=num; i++) {
			if(i % 5 == 0) {		// 만약 i=0;으로 했다면 오류난다.
				cnt++;
				sum += i;
			}
		}
		
		System.out.println("입력 값: " + num);
		System.out.println("5의 배수의 개수: " + cnt);
		System.out.println("5의 배수의 합: " + sum);
		
		sc.close();
	}
}
