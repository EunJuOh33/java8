package Day0409;

public class Account {
	private int tot = 0;
	synchronized void deposit(int amt) {
		tot += amt;
	}
	
	int gettot() {
		return tot;
	}
}
