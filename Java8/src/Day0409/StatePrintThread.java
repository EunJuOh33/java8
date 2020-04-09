package Day0409;

public class StatePrintThread extends Thread {
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	
	public void run() {
		while(true) {	//������ ���¸� 0.5�ʿ� �� ���� ���
			Thread.State state = targetThread.getState();	//Ÿ�� �������� ���¸� ����ϴ� �ڵ�
			System.out.println("Ÿ�� ������ ����: " + state);
			
			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			if(state == Thread.State.TERMINATED) {	//Ÿ�� �������� ���°� ����Ǿ��ٸ�
				break;
			}
			try {
				Thread.sleep(500);	//0.5�ʰ� �Ͻ� ����
			} catch(Exception e) {}	
		}
	}
}
