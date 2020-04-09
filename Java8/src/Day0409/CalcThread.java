package Day0409;

public class CalcThread extends Thread {
	public CalcThread(String name) {	//생성자 생성 때 이름 결정
		setName(name);
	}
	
	public void run() {
		for(int i=0; i<2000000000; i++) {
			
		}
		System.out.println(getName());	//스레드의 이름을 출력하라.
	}
}
