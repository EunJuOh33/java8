package Day0409;

public class Customer extends Thread {
	Account accl;
	Customer(Account acc) {
		this.accl = acc;
	}
	
	public void run() {
		try {
			for(int i=0; i<300; i++) {
				System.out.println("쓰레드 " + getName() + " : " + i + "번째");
				accl.deposit(1000);
				sleep(50);
				if(accl.gettot() >= 1000000)
					break;
			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
