package java8;

import java.util.Random;
import java.util.Scanner;

public class Day032405 {
	public static void main(String[] args) {
		/* 구구단 게임 10회 완료시 실행 시간을 출력하세요. */
		Scanner sc = new Scanner(System.in);	//입력은 for문 밖에서 받는다.
		Random rd = new Random();
		int num1, num2, quiz, answer;
		
		Long startTime = System.currentTimeMillis();
		for(int i = 0; i < 10; i++) {		// 10번 반복
			num1 = (int)(Math.random() * 8) + 2;	// (int)로 강제형변환.
			num2 = (int)(Math.random() * 9) + 1;	// (int)(Math.random() * 8) + 2; 같은 의미
			
			quiz = num1 * num2;
			System.out.print((i + 1) + ": " + num1 + "x" + num2 + " = ");
			answer = sc.nextInt();
			
			if(quiz == answer) {
				System.out.println("정답입니다.");
			} else {
				System.out.println("틀렸습니다. 게임을 종료합니다.");
				System.exit(0);		// 틀렸을 때 종료.
			}
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("[게임 진행 시간]");
		System.out.println(endTime - startTime + " ms");
		sc.close();
	}
}
