package java8;

import java.util.Scanner;

public class Day032503 {
	public static void main(String[] args) {
		/* 구구단 게임을 작성하세요. */
		Scanner sc = new Scanner(System.in);
		System.out.println("답을 입력하세요.");
		int subScore = 0;	//감점된 점수를 저장하기 위해 만들었다.
		
		long startTime = System.currentTimeMillis();
		for(int i=1; i<=9; i++) {
			int num1 = (int)(Math.random() * 8) + 2;	// 2 ~ 9까지
			int num2 = (int)(Math.random() * 9) + 1;	// 1 ~ 9까지
			System.out.print(num1 + "X" + num2 + "=");
			int answer = sc.nextInt();
			
			if(num1 * num2 == answer) {
				System.out.println("정답입니다.");
			} else {
				subScore += 5;
				System.out.println("오답입니다. " + subScore + "점 감점입니다.");
			}
		}
		long endTime = System.currentTimeMillis();
		long playTime = endTime - startTime / 1000;	//밀리초 -> 초
		long score = 200 - playTime - subScore; 
		
		if(score > 100) {
			score = 100;
		} else if(score < 0) {
			score = 0;
		}
		System.out.println("최종 점수는 " + score + "입니다.");
		
		sc.close();
	}
}
