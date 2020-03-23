package java8;
import java.util.Scanner;

public class Day032006 {

	public static void main(String[] args) {
		/*
		 * 몇 단을 출력할지 입력받아서 화면에 출력하는 프로그램을 작성하세요.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단을 출력하시겠습니까?(2~9숫자): ");
		int num = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			for(int j=num; j<=num; j++) {
				System.out.print(j + "x" + i + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
		sc.close();
	}
}
