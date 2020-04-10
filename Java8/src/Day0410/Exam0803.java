package Day0410;

public class Exam0803 extends Thread {
	/* 4개의 쓰레드가 100만원이 고갈될 때까지 경쟁적으로 9800원씩을 인출한다.
	 * 총액부분은 임계영역으로 한 순간에 하나의 쓰레드만 접근하도록 작성하시오.
	 */
	public static void main(String[] args) {
		Account account = new Account();
		Customer[] cArr = new Customer[4];
		for(int i=0; i<4; i++) {
			cArr[i] = new Customer(account);
			cArr[i].start();
		}
		for(int i=0; i<4; i++) {
			try {
				cArr[i].join();
			} catch(InterruptedException e) {}
		}
		System.out.println("총액은: " + account.getBalance());
	}
}


	class Account {
		int balance = 1_000_000;
		
		synchronized void deposit(int money) {
			if(balance-money <0) {
				Thread.currentThread().interrupt();
			} else {	
				balance -= money;
				System.out.println(money + "원을 " + Thread.currentThread().getName()
						+ "가 인출, 남은 잔액: " + getBalance());
			}			
		}
		
		
		public int getBalance() {
			return balance;
		}
	}	
	
	
	class Customer extends Thread {
		private Account account;
		
		public Customer(Account account) {
			this.account = account;
		}
		
		@Override
		public void run() {
			while(true) {
				account.deposit(9800);
				if(interrupted()) {
					break;
				}
			}
		}
	}

