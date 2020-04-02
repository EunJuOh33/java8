package Day0402;

public class HangmanEx extends Hangman {
	public static void main(String[] args) {
		Hangman hman = new Hangman();	//괄호 안에 정답을 적으면 다른 단어로 게임 가능
										//new Hangman, new Hangman2 둘 다 사용
		hman.playGame();
	}
}
