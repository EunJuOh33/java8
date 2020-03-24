package java8;

import java.util.Scanner;

public class Day032402 {
	public static void main(String[] args) {
		/* Hello, World 0 ~ Hello world 9 출력  */
		for(int i=0; i<10; i++) {
			System.out.println("Hello, world " + i);
		}
		System.out.println();	// 그냥 한 줄 띄우는 기능
		
		
		/* 위 결과물을 반전시켜서 Hello, world 9 ~ 0 출력*/
		for(int i=9; i>=0; i--) {
			System.out.println("Hello, world " + i);
		}
		
		
		/* @를 5개씩 7줄 출력하세요. */
		for(int i=0; i<7; i++) {
			System.out.println("@@@@@");
		}
		System.out.println();
		
		
		/* 위의 출력문을 중첩 for문으로 변경하세요.*/
		for(int i=0; i<7; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("@");
			}
			System.out.println();	//한 줄 @@@@@ 출력 후 한 줄 띄운다는 의미 
		}
		System.out.println();
		
		
		/* 위의 출력물에서 2열과 4열이 #이 되도록 변경하세요. */
		for(int i=0; i<7; i++) {
			for(int j=0; j<5; j++) {
				if(i%2 == 0) {
					System.out.print("#");
				} else {
					System.out.print("@");
				}
			}System.out.println();
		}
		System.out.println();
		
		
		/* 문자열을 입력받아서 for문으로 출력하기 */
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해 주세요.");
		System.out.println("입력 > ");
		String str = sc.nextLine();		//문자열은 nextLine()
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
}
