package java8;

import java.util.Random;
import java.util.Scanner;

public class Day032616 {
	public static void main(String[] args) {
		/* 숫자 야구 게임 만들기
		* 같은 자리, 같은 숫자 : 스트라이크
		* 다른 자리지만 같은 숫자가 있다면 : ball
		* 스트라이크, ball 둘 다 없다면 : out
		* 다 맞으면 정답!
		*/
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("숫자 야구게임입니다.");
		int[] com = new int[3];
		com[0] = rd.nextInt(9) + 1;
		
		/* 컴퓨터 */
		do {
			com[0] = rd.nextInt(9) + 1;
		} while(com[0] == com[1]);
		do {
			com[2] = rd.nextInt(9) + 1;
		} while(com[0] == com[2] || com[1] == com[2]);
		
		int strike = 0, ball = 0;
		
		
		int[] user = new int[3];
		for (int x = 0; x < 11; x++) {
		/* user 입력 부분 */
		System.out.print("첫 번째 값을 입력해 주세요.(1~9): ");
		do {
			if(user[0] !=0) {
				System.out.println("범위를 초과하엿습니다. 다시 입력해 주세요.");
			}
			user[0] = sc.nextInt();
		} while(user[0] < 1 || user[0] > 9);
		
		do {	//첫 번째 값과 두 번째 값의 중복을 없애주기 위해 do while 사용
			if(user[0] == user[1]) {
				System.out.println("동일한 숫자는 입력할 수 없습니다.");
			}
			System.out.print("두 번째 값을 입력해 주세요.(1~9): ");
			do {
				if(user[1] !=0) {
					System.out.println("범위를 초과하였습니다. 다시 입력해 주세요.");
				}
				user[1] = sc.nextInt();
			} while(user[1] < 1 || user[1] > 9);
		} while(user[0] == user[1]);
		
		do {
			if(user[0] == user[2] || user[1] == user[2]) {
				System.out.println("동일한 숫자는 입력할 수 없습니다.");
			}
			System.out.print("세 번째 값을 입력해 주세요.(1~9): ");
			do {
				if(user[2] !=0) {
					System.out.println("범위를 초과하였습니다. 다시 입력해 주세요.");
					}
					user[2] = sc.nextInt();
				} while(user[2] < 1 || user[2] > 9);
			} while (user[0] == user[2] || user[1] == user[2]);
	
			for (int i = 0; i <3; i++) {
				if (com[i] == user[i]) {
					strike++;
				}
			}
		
			if(com[0] == user[1] || com[0] == user[2]) {
				ball++;
			}	
			if(com[1] == user[0] || com[1] == user[2]) {
				ball++;
			}
			if(com[2] == user[0] || com[2] == user[1]) {
				ball++;
			}
			System.out.println(strike + "스트라이크, " + ball + "볼");
			if(strike == 3) {
				System.out.println("정답입니다. 게임을 종료합니다.");
				System.exit(0);
			}
			strike = ball = 0;
			user = new int[3];
		}
		sc.close();
	}
}
