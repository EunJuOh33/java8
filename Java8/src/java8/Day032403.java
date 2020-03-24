package java8;

import java.util.Random;
import java.util.Scanner;

public class Day032403 {
	public static void main(String[] args) {
		/* 난수를 사용해서 구구단 문제를 출력하고 답을 입력하도록 작성하세요. */
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int num1, num2, quiz, answer;
		
		Long startTime = System.currentTimeMillis();	//long형으로 사용해보자.
		for(int i = 0; i < 10; i++) {		// 10번 반복
			num1 = (int)(Math.random() * 8) + 2;	//(int)로 강제형변환
			num2 = rd.nextInt(9) + 1;
	
			quiz = num1 * num2;
			System.out.print(num1 + "x" + num2 + " = ");
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
	}
}
