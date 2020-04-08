package Baekjoon;

import java.util.Scanner;

public class No004 {
	public static void main(String[] args) {
		/* 45분 일찍 알람 설정하기 */
		
		//상근이가 설정한 알람 시간 입력받기
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		//잘못된 입력
		if((H<0 || H>23) || (M<0 || M>59)) {
			System.out.print("잘못입력하셨습니다.");
			System.exit(0);
		}
		
		//창영이의 방법으로 알람 시간 고치기
		int CM = M - 45;
		int CH = H;
		if(CM <0) {
			CM += 60;
			CH--;
			if(CH<0) {
				CH += 24;
			}
		}	
		System.out.print(CH + " " + CM);
		
		sc.close();
	}
}
