package java8;
import java.util.Scanner;

public class Day032011 {

	public static void main(String[] args) {
		int iValue;
		int resValue = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요! : ");
		iValue = sc.nextInt();
		
		while(iValue > 0) {
			resValue = resValue * 10;
			resValue = resValue + (iValue % 10);
			iValue /= 10;
		}
		
		System.out.println("바뀐 숫자 : " + resValue);
		
		sc.close();
	}
}
