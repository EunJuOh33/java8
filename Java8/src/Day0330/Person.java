package Day0330;

public class Person {
	void sound() {
		System.out.println("���ϴ�");
	}
	
	void run() {
		System.out.println("�޸���");
	}
	
	void eat() {
		System.out.println("������ �Դ�.");
	}
	
	void oneDay() {
//		Person person = new Person();	//���� Ŭ���� �ȿ��� �޼��带 ȣ���� ��
										//��ü�� ������ �ʿ� ����.
//		person.sound();
		sound();
		run();
		eat();
	}
}
