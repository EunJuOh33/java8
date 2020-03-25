package java8;

import java.util.Scanner;

public class Day032408 {
	public static void main(String[] args) {
		/*
		 * 1~100 중에 랜덤하게 정답을 설정한다.
		 * 입력한 값이 정답보다 크면 "Up"
		 * 입력한 값이 정답보다 작으면 "Down"으로 출력합니다.
		 * 최대 횟수는 10회로 설정.
		 * 게임적 요소를 위해 점수를 출력합니다.
		 */
		/* 변수 선언 */
		int num = (int)(Math.random() * 100) + 1;	// 1~100까지 숫자 지정
		int inputNum = 0;	
		int cnt = 0;	//몇 번만에 맞췄는지 알고싶다.
		Scanner sc = new Scanner(System.in);
		
		/* 게임 실행 */
		long startTime = System.currentTimeMillis();
		while(true) {
			/* 유저 입력 */
			do {
				if(inputNum != 0) {
					System.out.print("잘못입력하셨습니다.");
				}
				System.out.print("숫자를 입력해 주세요(1~100): ");
				inputNum = sc.nextInt();
			} while(inputNum < 1 || inputNum > 100);
			
			/* 결과 출력 */
			cnt++;
			if(num == inputNum) {
				System.out.println("정답입니다." + cnt + "회 입력하였습니다.");
				break;
			} else if(num > inputNum ) {
				System.out.println("Up!!" + cnt + "회 입력하였습니다.");
			} else {
				System.out.println("Down!!" + cnt + "회 입력하였습니다.");
			}
			
			if(cnt == 10) {
				System.out.println("최종점수는 0점입니다. 게임을 종료합니다.");
				System.exit(0);
			}
		}
		
		/* 점수 계산 */
		long endTime = System.currentTimeMillis();
		long playTime = (endTime - startTime) / 1000;	//밀리초 -> 초
		double score = (60 - playTime) / 0.6;	// 60은 60초(1분) 빨리 끝낼 수록 고득점이 된다.
		System.out.println("최종점수는" + score + "점입니다. 게임을 종료합니다.");
		
		sc.close();
	}
}
