package Day0410;

public class Exam0801 extends Thread {
	int delay;
	
	Exam0801(String name, int delay) {
		super(name);
		this.delay = delay;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				System.out.println(getName() + " ");
				Thread.sleep(delay);
			}
		} catch (Exception e) {
			System.out.println("error");
			return;
		}
	}
	
	public static void main(String[] args) {
		Exam0801 t1 = new Exam0801("쓰레드1", 500);
		Exam0801 t2 = new Exam0801("쓰레드2", 700);
		
		t1.start();
		t2.start();
	}
}
