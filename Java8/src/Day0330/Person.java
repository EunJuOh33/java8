package Day0330;

public class Person {
	void sound() {
		System.out.println("말하다");
	}
	
	void run() {
		System.out.println("달리다");
	}
	
	void eat() {
		System.out.println("음식을 먹다.");
	}
	
	void oneDay() {
//		Person person = new Person();	//같은 클래스 안에서 메서드를 호출할 때
										//객체를 생성할 필요 없다.
//		person.sound();
		sound();
		run();
		eat();
	}
}
