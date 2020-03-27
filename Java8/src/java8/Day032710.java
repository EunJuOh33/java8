package java8;

import java.util.Scanner;

public class Day032710 {
	public static void main(String[] args) {
		/*
		 * 출석20%, 과제20%, 중간고사30%, 기말고사30%하여 100점 만점
		 * 최대점수 : 출석20, 과제20, 중간고사30, 기말고사30
		 * 학점 : 90~100:A, 80~89:B, 70~79:C, 60~69:D, 0~59:F
		 */
		int a = 0, b = 0, c = 0, d = 0; 
		char grade = 0;
		Scanner sc = new Scanner(System.in);

		
		do {
			if(a < 0 || a > 100) {
				System.out.println("입력 범위를 초과하였습니다.");
			}
			System.out.print("출석 점수는 몇 점 입니까? : ");
			a = sc.nextInt();
		} while (a < 0 || a > 100);
		
		do {
			if(b < 0 || b > 100) {
				System.out.println("입력 범위를 초과하였습니다.");
			}
			System.out.print("과제 점수는 몇 점 입니까? : ");
			b = sc.nextInt();
		} while (b < 0 || b > 100);
		
		do {
			if(c < 0 || c > 100) {
				System.out.println("입력 범위를 초과하였습니다.");
			}
			System.out.print("중간고사 점수는 몇 점 입니까? : ");
			c = sc.nextInt();
		} while (c < 0 || c > 100);
		
		do {
			if(d < 0 || d > 100) {
				System.out.println("입력 범위를 초과하였습니다.");
			}
			System.out.print("기말고사 점수는 몇 점 입니까? : ");
			d = sc.nextInt();
		} while (d < 0 || d > 100);
		
		
		int score = (int)(a / 100 * 20 + b / 100 * 20 + c / 100 * 30 + d / 100 * 30);
		System.out.print("총 점은 " + score + "입니다.");
		
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >= 70) {
			grade = 'D';
		} else if(score >= 60) {
			grade = 'F';
		}
		System.out.println("당신의 학점은 " + grade + "입니다.");
		
		sc.close();
	}
}
