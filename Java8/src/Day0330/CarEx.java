package Day0330;

public class CarEx {
	public static void main(String[] args) {
		Car myCar = new Car("쌍용자동차", "노랑", 350);	//Car 객체 생성(instance)
		
		System.out.println("데이터 입력 전");
		System.out.println(myCar.company);
		System.out.println(myCar.maxSpeed);
		
		myCar.company = "현대자동차";
		myCar.model = "아반떼";
		myCar.color = "은색";
		myCar.maxSpeed = 300;
		myCar.speed = 100;
		
		System.out.println("데이터 입력 후");
		System.out.println(myCar.company);	//현대자동차
		System.out.println(myCar.maxSpeed);	//300
		
		
		Car yourCar = new Car(null, null, 0);
		System.out.println(yourCar.company);
		System.out.println(yourCar.maxSpeed);
		
		System.out.println();
		
//		int num1 = 10;
//		int num2 = 10;
//		num1 = 100;
		
		
		
		
		System.out.println("생성자 예제");
		Car c1 = new Car();
		System.out.println(c1.company);
		System.out.println(c1.model);
		System.out.println(c1.color);
		System.out.println(c1.maxSpeed);	//300
		System.out.println(c1.speed);
		
		Car c2 = new Car(250);
		System.out.println(c2.company);
		System.out.println(c2.model);
		System.out.println(c2.color);
		System.out.println(c2.maxSpeed);	//250으로 변경
		System.out.println(c2.speed);
		
		Car c3 = new Car("파랑", 350);
		System.out.println(c3.company);
		System.out.println(c3.model);
		System.out.println(c3.color);		//파랑으로 변경
		System.out.println(c3.maxSpeed);	//350으로 변경
		System.out.println(c3.speed);
		
		
		c3.accel();	//메서드 호출
		c3.speed = 325;
		c3.accel();		//10을 더해서 335가 나온다.
		c3.accel();
		c3.accel();
		c3.accel();
		c3.accel();
		c3.brake();	//0
	}                       
}
