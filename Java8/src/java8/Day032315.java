package java8;

import java.util.Scanner;

public class Day032315 {
	public static void main(String[] args) {
		/* 구구단을 2단부터 9단까지 출력하세요. */
		
		System.out.println("구구단 출력");
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j + "x" + i + "=" + (i * j) + "\t");	// \t는 tap 키를 눌렀을 때와 같은 효과
																		// 첫 줄에 1x2, 1x3, 1x4 ... 이렇게 들어간다.
			}
			System.out.println();
		}
		System.out.println();
		
		/* 몇 단을 출력할지 입력받아서 출력해 주세요. */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단을 출력하시겠습니까?: ");
		int num = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			for(int j=num; j<=num; j++) {
				System.out.print(j + "x" + i + "=" + (i * j) + "\t");
			}
		}
		sc.close();
	}
}
