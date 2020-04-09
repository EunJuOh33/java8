package Day0409;

public class ThreadClassE1 extends Thread {
	int delay;
	ThreadClassE1 (String name, int delay) {
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
		ThreadClassE1 t1 = new ThreadClassE1 ("쓰레드1", 500);
		ThreadClassE1 t2 = new ThreadClassE1 ("쓰레드2", 700);
		
		t1.start();
		t2.start();
	}

}
