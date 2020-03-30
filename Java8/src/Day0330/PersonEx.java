package Day0330;

public class PersonEx {
	public static void main(String[] args) {
		Person person = new Person();	//객체 생성
		person.sound();	//말하다
		person.run();	//달리다
		person.eat();	//음식을 먹다.
		
		System.out.println();
		person.oneDay();	//말하다 달리다 음식을 먹다.
		
	}
}
