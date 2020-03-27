package java8;

import java.util.Scanner;

public class Day032709 {
	public static void main(String[] args) {
		/*
		 * 2개의 정수를 입력받아서 곱을 출력(while 또는  do~while 사옹)
		 * 곱의 값이 500을 초과하면 프로그램 종료
		 */
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("정수 두 개를 입력하시오.: ");
			int num1 = sc. nextInt();
			int num2 = sc. nextInt();
			int res = num1 * num2;
			System.out.println(num1 + "x" + num2 + "=" + res);
			System.out.println();
			if(res > 500) {
				break;
			}
		}
		System.out.println("결과값이 500을 초과하여 프로그램을 종료합니다.");
		
		sc.close();
	}
}
