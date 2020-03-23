package java8;
import java.util.Scanner;

public class Day032010 {

	public static void main(String[] args) {
		int intyear;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("윤년을  판별할 년도를 입력해 주세요.: ");
		intyear = sc.nextInt();
		
		//윤년 판별
		if((intyear % 4 == 0 && intyear % 100 != 0) || (intyear % 400 == 0)) {
			System.out.println(intyear + "년은 윤년이다.");
		} else {
			System.out.println(intyear + "년은 윤년이 아니다.");
		}
	sc.close();	
	}
}
