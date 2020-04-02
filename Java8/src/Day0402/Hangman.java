package Day0402;

import java.util.Scanner;

public class Hangman {
	private String hiddenString;		//숨겨진 문자열(문제)
	private StringBuffer outputString;	//플레이어의 입력에 따른 결과로 보여줄 문자열
	private StringBuffer inputString;	//플레이어가 입력한 문자들의 모임
	private int remainder;		//맞힐 문자열(못 맞히고 남아있는 문자의 수)
	private int failed;			//실패한 횟수
	private Scanner sc;
	private String inputData;
			
	
	public Hangman() {
		hiddenString = "hello";
		outputString = new StringBuffer();	//정답 초기화
		inputString = new StringBuffer();
		remainder = hiddenString.length();
		failed = 0;
		sc = new Scanner(System.in);
		inputData = "";
		for(int i=0; i<remainder; i++) {
			outputString.append("_");
		}	
	}	
	
	
	/* 초기화 코드 추가 */
	public Hangman(String solution) {
		outputString = new StringBuffer();	//정답 초기화
		inputString = new StringBuffer();
		remainder = hiddenString.length();
		failed = 0;
		sc = new Scanner(System.in);
		inputData = "";
		for(int i=0; i<remainder; i++) {
			outputString.append("_");
		}
	}	

	public void playGame() {
		System.out.println("행맨 게임을 시작합니다.");
		show();
		do {
			do {
				setInputData();
			} while(checkChar(inputData));
			processGame();
			show();
		} while(failed < 6 && remainder > 0);	//틀린 횟수가 6이 되거나 remainder가 0이 되면 게임 종료.
		System.out.println("행맨 게임을 종료합니다.");
	}
	
	private void show() {
		System.out.println("틀린  횟수: " + failed + "/6");
		System.out.println(outputString);
		System.out.println();
	}
	
	private void setInputData() {
		System.out.print("문자를 입력해 주세요.: ");
		this.inputData = sc.next().substring(0, 1);	//제일 앞 한 글자만 들어가게 된다.
	}
	
	private boolean checkChar(String inputData) {	//true, false로 나오도록 boolean 사용
		if(inputString.indexOf(inputData) == -1) {	//없다는 뜻
			inputString.append(inputData);
			return false;
		}
		System.out.println("이미 입력한 문자입니다.");
		return true;
	}
	
	//연산
	private void processGame() {
		if(hiddenString.indexOf(inputData) == -1) {
			failed++;		//틀린 갯수 추가
		} else {
			int index = hiddenString.indexOf(inputData);
			do {
				outputString.setCharAt(index, inputData.charAt(0));
				remainder--;
				index = hiddenString.indexOf(inputData, index + 1);	//index+1부터 다시 검사하라.
			} while(index != -1);
		}
	}
}	