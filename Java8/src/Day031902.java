import java.util.Scanner;

public class Day031902 {

	public static void main(String[] args) {
		/* 입력된 값이 짝수인지 홀수인지 확인하는 프로그램*/
		Scanner sc = new Scanner(System.in);
		int inputNumber = 0;	//0으로 초기화
		
		System.out.println("홀수와 짝수를 판별하는 프로그램입니다.");
		System.out.print("숫자를 입력해 주세요: ");
		inputNumber = sc.nextInt();
		
//		String result = inputNumber % 2 == 0 ? "짝수" : "홀수";	//삼항연산자를 사용
		String result = "";	//숫자형은 0으로 초기화하고 문자열은 ""으로 초기화합니다.
		
		if(inputNumber % 2 ==0) {	//if문을 사용하여 조건이 true일 경우에 실행하는 중괄호 영역을 작성
			result = "짝수";
			System.out.println("짝수인지 판별중입니다.");
		}
		else {
			result = "홀수";
			System.out.println("홀수인지 판별중입니다.");
		}
		System.out.println("입력하신 숫자는 " + inputNumber + "이고, 이 숫자는 " + result + "입니다.");
		
		sc.close();
	}
}
