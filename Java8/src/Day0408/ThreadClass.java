package Day0408;

public class ThreadClass extends Thread{
	private String name;
	
	public ThreadClass(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				System.out.println(name + " ");
			}
		} catch(Exception e) {}
	}
}
