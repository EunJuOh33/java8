package Day0330;

public class Car {	//����� main�޼��带 �ۼ��ϸ� �� �ȴ�.
		/* �ʵ� */
		String company = "����ڵ���";
		String model = "���";
		String color = "�Ķ�";
		int maxSpeed = 250;
		int speed;
		
		/* ������ */
		Car() {						//�����ڸ� �������� ������ �⺻�����ڰ� �ڵ����� �ۼ��˴ϴ�.
									//�����ڴ� �ʿ��Ѹ�ŭ �����ؼ� ����� �� �ִ�. - �ߺ�����
//			this.company = "����ڵ���";
//			this.color = "����";
//			this.maxSpeed = 300;
			this("����ڵ���", "����", 300);
		}
		
		Car(String company, String color, int maxSpeed) {
			this.company = company;
			this.color = color;
			this.maxSpeed = maxSpeed;
		}
		
		Car(String color, int maxSpeed) {
			this("����ڵ���", color, maxSpeed);
		}
		
		
		Car(int maxSpeed) {					
//			this.company = "����ڵ���";
//			this.color = "����";
//			this.maxSpeed = maxSpeed;
			this("����ڵ���", "����", maxSpeed);	//�̷��� �ٿ��� ���� �� �ִ�.
		}
		
		
//		Car(String com, String col, int max) {	//�̷��� �ص� ��������� �ڹٿ����� ���� this�� ����Ѵ�.
//			company = com;
//			color = col;
//			maxSpeed = max;
//		}
//		
//		Car(String company, int maxSpeed, String color) {
//			
//		}
//		
//		Car(String color, int speed, int maxSpeed) {
//			
//		}
//		
//		Car(String company, String color, int speed, int maxSpeed) {	//�Ű������� ������ ������� �ٲ� �� �ְ�,
//																		//������ �ø� �� �ִ�.
//			
//		}
//		
//		Car(int maxSpeed, String color, String company) {	//String color, String company, int maxSpeed
//															//�̷��Դ� �Ұ���. �ڷ��� ���°� �ٸ��ų� ������ �޶������ �ߺ����� ����.
//			
//		}
		
		
		/* �޼ҵ�(�޼���) */
		void accel() {
			speed += 10;	//this.speed�� ���� ��Ȯ
			if(speed > maxSpeed) {
				speed = maxSpeed;
			}
			System.out.println("���� �ӵ�: " + speed);
		}
		
		void brake() {
			speed = 0;
			System.out.println("���� �ӵ�: " + speed);
		}
}
