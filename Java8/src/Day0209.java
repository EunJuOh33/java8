import java.util.Random;
import java.util.Scanner;

public class Day0209 {

	public static void main(String[] args) {
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		String name = "";	//String형은 문자열(텍스트)을 입력합니다. 초기화는 ""로 할 수 있습니다.
		int luck = 0;
		Random rd = new Random();
		luck = rd.nextInt(51) + 50;
		luck = (int)(Math.random() * 51) + 50;
		
		//사용자의 이름을 입력 받습니다.
		System.out.print("이름을 입력해 주세요: ");
		name = sc.next();
		
		//오늘의 운세 출력
		System.out.println(name + "님의 오늘의 운세는");
		String str = "%입니다.";	//String형에는 문자열을 저장할 수 있습니다.
								//String형은 참조형으로 그 값이 저장되는 것이 아니라 값이 가지고 있는 메모리 주소가 저장된다.
								//작은 따옴표로 감싸면  char형이고 큰 따옴표로 감싸면 String형입니다.
		System.out.println(luck + str);	//0~100사이의 수를 출력
		
		//행운지수는 50~100사이의 수를 출력하게 변경해 주세요.
		//스캐너 닫기
		sc.close();
	}
}
