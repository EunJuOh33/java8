package Day0409;

public class YieldEx {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		threadA.start();	//�� �� �� ���������� ����Ѵ�.
		threadB.start();
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		threadA.work = false;	//3�� �Ŀ� ������A�� ��� ���·� ������.
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		threadA.work = true;
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		threadA.stop = true;
		threadB.stop = true;
	}
}
