package Day0409;

public class SumThread extends Thread {
	private long sum;
	
	public long getSum() {
		return sum;
	}
	
	public void setSum(long sum) {
		this.sum = sum;
	}
	
	public void run() {
		for(int i=1; i<=1_000_000_00; i++) {	//5050
			sum += i;
		}
	}
}
