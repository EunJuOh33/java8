
public class Day0204 {

	public static void main(String[] args) {
		double number1;
		number1 = 3.14;
		double number2 = 1.23;
		double result1 = number1 + number2;
		System.out.println(result1);
		
		float result2 =(float)(number1 + number2);	//강제형변환
		System.out.println();
		
		double result3 = 3.14 + 1.23;
		System.out.println(result3);
		
		float result4 = 3.14f + 1.23f;	//실수의 기본형은 double이기 때문에 형변환이 필요. float도 대문자, 소문자 사용 가능하지만 보통 소문자f를 쓴다.
		System.out.println(result4);	//float형 값에는 숫자의 끝에  f를 붙인다.
		
		double result5 = 3.14f + 1.23;	//서로 다른 자료형을 연산하게 되면 큰 자료형으로 자동형변환 한다.
		
		long result6 = 10 + 20L;	//정수도 동일하게 서로 다른 자료형이 연산하게 되면 큰 쪽으로 자동형변환 한다.
		
		int num1 = 100;
		System.out.println(num1);
		num1 = 200;
		System.out.println(num1);
		num1 = 300;
		System.out.println(num1);
	}
}
