package Day0409;

public class ThreadA extends Thread {
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadA �۾� ����");
			} else {
				Thread.yield();	//�ڱ� �ڽ� ������ A
			}
		}
		System.out.println("ThreadA ����");
	}
}
