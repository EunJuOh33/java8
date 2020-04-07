package Baekjoon;

import java.util.Scanner;

public class No001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(score < 0 || score > 100) {
			System.out.print("잘못 입력하셨습니다.");
			System.exit(0);
		}
		
		if(score>=90 && score<=100 ) {
			System.out.print("A");
		} else if(score>=80) {
			System.out.print("B");
		} else if(score>=70) {
			System.out.print("C");
		} else if(score>=60) {
			System.out.print("D");
		} else {
			System.out.print("F");
		}
	}
}
