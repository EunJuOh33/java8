package java8;

import java.util.Scanner;

public class Day032313 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 줄을 출력하시겠습니까?: ");
		int line = sc.nextInt();
		
		if(line % 2 == 0) {
			System.out.print("짝수는 허용하지 않습니다. 프로그램을 종료합니다.");
			System.exit(0);	// 종료. 여기서 0은 에러코드. 다른 숫자를 넣어도 되지만 보통 0을 넣는다..
		}
		
		int upLine = line / 2;
		int downLine = line - upLine;
		
		for(int i=0; i<upLine; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();	//for문이 끝나면 줄바꿈이 일어난다.
		}	
		
		for(int i=downLine; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}	
}
