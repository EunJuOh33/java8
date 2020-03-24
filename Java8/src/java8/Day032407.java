package java8;

import java.util.Scanner;

public class Day032407 {
	public static void main(String[] args) {
		/*
		 * 문제 : 두 수를 입력받아 두 수의 최대공약수와 최소 공배수를 반환하는 함수를 완성해 보시오.
		 * 3 12 => [3, 12]
		 * 2 5 => [1, 10]
		 * 
		 * 힌트 : 두 수의 곱은 최대 공약수 x 최소 공배수이다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수를 입력해 주세요.: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res1 = 0, res2 = 0;	//최소공배수와 최대공약수
		
		for(int i=1; i<= Integer.MAX_VALUE; i++) {
			if(i % a == 0 && i % b == 0) {
				res1 = i;
				break;
			}
		}
		res2 = a * b / res1;
		System.out.println("최소 공배수: " + res1 + " ,최대 공약수: " + res2);
		sc.close();
	}
}
