package Day0331;

import java.util.Scanner;

public class EX4 {
	public static void main(String[] args) {
		/* 입력한 문자열을 거꾸로 뒤집어 출력하는 프로그램 */
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 문자열을 입력하세요.: ");
		String str = sc.nextLine();
		
		//문자열 리버싱
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		
		//출력
		System.out.println("입력한 문자열 : " + str);
		System.out.println("거꾸로 바뀐 문자열 : " + sb);
		sc.close();
	}
}
