
public class day0221 {

	public static void main(String[] args) {
		int number1;	//변수의 선언, 자료의 형태는 선언을 할 때만 사용합니다.
		int number2;	//변수의 선언
		int number3,number4; //같은 자료형은 동시에 선언 가능
		
		number1 = 10;	//변수 사용시 자료의 형태는 생략합니다.
		number2 =20;	//'='은 오른쪽의 값을 왼쪽에 대입하는 기호입니다.
		number3 = 30;	//왼쪽과 오른쪽의 자료형이 같아야만 대입이 가능합니다.
		number4 = 40;
		
		int number5 = 50;	//변수를 선언과 동시에 값을 할당한 것. 위는 변수를 선언하고 할당을 나중에 했다.
		int number6 = 60, number7 = 70;	//선언과 동시에 값을 할당할 때도 동시 선언이 가능합니다.
		
		System.out.println(number1);	//변수를 출력할 때는 쌍따옴표(")로 감싸지 않습니다.
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(number4);
		System.out.println(number5);
	}

}
