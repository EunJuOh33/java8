package java_oh;

import java.util.Scanner;

public class Day0408 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("직사각형의 가로와 세로 길이를 입력하세요.");
		
		int w = sc.next();
		int h = sc.nextInt();
		
		int res1 = w * h;
		int res2 = 2 * (w + h);
		
		System.out.println("직사각형의 면적은 " + res1 + "입니다.");
		System.out.println("직사각형의 둘레는 " + res2 + "입니다.");
	}
}
