package Baekjoon;

import java.util.Scanner;

public class No003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		//오류
		if((x<-1000 && x>1000) || (y<-1000 && y>1000)) {
			System.out.print("잘못 입력하셨습니다.");
			System.exit(0);
		}
		
		//문제풀이
		if(0<x && 0<y) {
			System.out.print("1");
		} else if(0>x && 0<y) {
			System.out.print("2");
		} else if(0>x && 0>y) {
			System.out.print("3");
		} else {
			System.out.print("4");
		}
	}
}
