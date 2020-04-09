package Day0409;

public class StatePrintThread extends Thread {
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	
	public void run() {
		while(true) {	//스레드 상태를 0.5초에 한 번씩 출력
			Thread.State state = targetThread.getState();	//타겟 스레드의 상태를 출력하는 코드
			System.out.println("타겟 스레드 상태: " + state);
			
			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			if(state == Thread.State.TERMINATED) {	//타겟 스레드의 상태가 종료되었다면
				break;
			}
			try {
				Thread.sleep(500);	//0.5초간 일시 정지
			} catch(Exception e) {}	
		}
	}
}
