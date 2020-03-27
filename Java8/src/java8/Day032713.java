package java8;

import java.util.Scanner;

public class Day032713 {
	public static void main(String[] args) {
		/* 가위바위보 게임 */
		final String ga = "가위";	//1
		final String ba = "바위";	//2
		final String bo = "보";		//3
		int com, user;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			/* 게임 시작 */
		com = (int)(Math.random() * 3) + 1;	//0, 1, 2
		
			do {
				/* 유저 입력 */
				System.out.println("가위, 바위, 보 중 하나를 선택하세요. ");
				System.out.print("<가위=1, 바위=2, 보=3, 종료=4> : ");
				user = sc.nextInt();	
						
				if(user < 1 || user > 4) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
				} else if(user == 4) {
					System.out.println("게임을 종료합니다.");
					System.exit(0);
				}
			} while (user < 1 || user > 3);
			
			
			/* 가위 바위 보 */
			String userStr = user == 1 ? "가위" : user == 2 ? "바위" : "보";
			String comStr = com == 1 ? "가위" : com == 2 ? "바위" : "보";
			
			if((user == 1 && com == 3) || (user == 2 && com == 1) 
					|| (user == 3 && com == 2)) {
				System.out.print("유저 승! 사람:" + userStr + ", 컴퓨터:" + comStr);
			} else if(user == com) {
				System.out.println("비겼습니다 ! 유저:" + userStr + ", 컴퓨터:" + comStr);
			} else {
				System.out.println("컴퓨터 승 ! 유저:" + userStr + ", 컴퓨터:" + comStr);
			}
			
			sc.close();
			/* 게임 끝 */
		}
	}
}
