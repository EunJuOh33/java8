package Day0408;

public class ThreadClassEx {
	public static void main(String[] args) {
		Thread t1 = new ThreadClass("스레드1");
		Thread t2 = new ThreadClass("스레드2");
		
		t1.start();
		t2.start();
	}
}
