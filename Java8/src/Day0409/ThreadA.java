package Day0409;

public class ThreadA extends Thread {
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadA 작업 내용");
			} else {
				Thread.yield();	//자기 자신 스레드 A
			}
		}
		System.out.println("ThreadA 종료");
	}
}
