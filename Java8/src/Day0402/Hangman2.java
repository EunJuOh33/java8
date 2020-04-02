package Day0402;

public class Hangman2 extends Hangman {
	static String[] arr = {"hello", "hospital", "capacity", "language"};
	static String str = arr[(int)(Math.random()*arr.length)];
	
	/* »ı¼ºÀÚ */
	public Hangman2() {
		super(str);
	}
}
