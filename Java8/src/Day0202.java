import java.util.Scanner;

public class Day0202 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	//s 자리는 원하는 스캐너 이름. 스캐너를 작성하세요.
		
		int number1, number2, result;	//int형 변수 number1과 number2를 선언하세요.
		
		System.out.println("number1과 number2의 값을 차례대로 넣어주세요.");	//화면에 number1과  number2의 값을 입력하도록 안내문구를 출력해 주세요.
		System.out.println("공백이나 엔터키로 값을 구분해 주세요.");
		
		number1 = s.nextInt();	//작성된 스캐너로  number1과  number2의 값을 입력하세요.
		number2 = s.nextInt();
		
		result = number1 + number2;	//합계를 화면에 출력해 주세요.
		System.out.print("두 값의 합계는 ");
		System.out.print(result);
		System.out.print("입니다.");
		//number1에는 10을 대입하고 number2에는 20을 대입해서 결과값이 30으로 출력되어야 합니다.
		
		s.close();	//스캐너를 닫아주세요.		
	}
}
