
public class Day0203 {

	public static void main(String[] args) {
		int number1 = 1000000000;
		int number2 = 2000000000;	//int의 범위는 -21억 ~ 21억 입니다.
		int result = number1 + number2;	//범위를 넘어서면 오버플로우가 발생합니다.
		System.out.println(result);
		
		long result2 = number1 + number2;	//오른쪽의 연산은 int + int 입니다.
											//그래서 결과값도  int입니다.
		System.out.println(result2);
			
		long num3 = 1000000000;
		long num4 = 2000000000;
		long result3 = num3 + num4;
		System.out.println(result3);
		
		long result4 = 1000000000L + 2000000000L; 	//일반적으로 연산에서 사용하는 정수는 int입니다.
		System.out.println(result4);
		
		byte num5 = 15;
		byte num6 = 1;
		int result5 = num5 + num6;	//자바의 기본 연산은 int입니다. byte + byte의 결과는 int입니다.
		
		short num7 = 3000;
		short num8 = 5000;
		int result6 = num7 + num8;	//short + short의 결과도 int입니다.
		System.out.println(result6);
		
		long result7 = num7 + num8;	//오른쪽의 자료형이 왼쪽의 자료형보다 작을 경우
									//오른쪽에서 왼쪽으로 대입이 가능합니다.
									//자동형변환, 묵시적형변환, promotion
//		int result8 = 10L;	//long형을 int에 대입할 수 었습니다.
		
		int num9 = 10;
		int num10 = 20;
		short result9 = (short)(num9 + num10);	//강제형변환, 명시적형변환, casting
												//큰자료형을 작은 자료형으로 변환할 때는 강제형변환을 해야 합니다.
		System.out.println(result9);
		
		int num11 = 10000;
		int num12 = 30000;
		short result10 = (short)(num11 + num12);
		System.out.println(result10);
	}
}
