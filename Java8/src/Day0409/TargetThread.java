package Day0409;

public class TargetThread extends Thread {
	public void run() {
		String sum = "";
		for(long i =0; i < 30_000; i++) {
		}
		
		try {
			Thread.sleep(1500);//1.5�ʰ� �Ͻ� ����
		} catch (Exception e) {}
		
		sum = "";
		for (long i=0; i < 30_000; i++) {
		}
	}
	
	
	public static void main(String[] args) {
		StatePrintThread spt = new StatePrintThread(new TargetThread());
		spt.start();
	}
}
