package java8;

import java.util.Scanner;

public class Day032408 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("답을 적어주세요.: ");
		int a = sc.nextInt();
		
		int num1 = (int)Math.random();
		
		if(a < num1) {
			System.out.print("더 높은 숫자입니다.");
		} else if(a > num1) {
			System.out.print("더 낮은 숫자입니다.");
		} else {
			System.out.print("정답입니다!");
		}
		sc.close();
	}
}
