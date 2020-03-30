package Day0330;

public class Car {	//여기는 main메서드를 작성하면 안 된다.
		/* 필드 */
		String company = "기아자동차";
		String model = "쏘울";
		String color = "파랑";
		int maxSpeed = 250;
		int speed;
		
		/* 생성자 */
		Car() {						//생성자를 생성하지 않으면 기본생성자가 자동으로 작성됩니다.
									//생성자는 필요한만큼 생성해서 사용할 수 있다. - 중복정의
//			this.company = "기아자동차";
//			this.color = "검정";
//			this.maxSpeed = 300;
			this("기아자동차", "검정", 300);
		}
		
		Car(String company, String color, int maxSpeed) {
			this.company = company;
			this.color = color;
			this.maxSpeed = maxSpeed;
		}
		
		Car(String color, int maxSpeed) {
			this("기아자동차", color, maxSpeed);
		}
		
		
		Car(int maxSpeed) {					
//			this.company = "기아자동차";
//			this.color = "검정";
//			this.maxSpeed = maxSpeed;
			this("기아자동차", "검정", maxSpeed);	//이렇게 줄여서 적을 수 있다.
		}
		
		
//		Car(String com, String col, int max) {	//이렇게 해도 상관없지만 자바에서는 보통 this를 사용한다.
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
//		Car(String company, String color, int speed, int maxSpeed) {	//매개변수의 개수는 마음대로 바꿀 수 있고,
//																		//종류도 늘릴 수 있다.
//			
//		}
//		
//		Car(int maxSpeed, String color, String company) {	//String color, String company, int maxSpeed
//															//이렇게는 불가능. 자료의 형태가 다르거나 개수가 달라야지만 중복정의 가능.
//			
//		}
		
		
		/* 메소드(메서드) */
		void accel() {
			speed += 10;	//this.speed가 좀더 정확
			if(speed > maxSpeed) {
				speed = maxSpeed;
			}
			System.out.println("현재 속도: " + speed);
		}
		
		void brake() {
			speed = 0;
			System.out.println("현재 속도: " + speed);
		}
}
