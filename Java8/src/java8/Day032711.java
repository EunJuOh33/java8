package java8;

import java.util.Scanner;

public class Day032711 {
	public static void main(String[] args) {
		/* 키보드로부터 상품의 단가와 수량을 입력받아
		 * 지불 금액과 할인율을 계산하여 출력하는 프로그램을 작성하시오.
		 * 총 상품 구입금액이 50만원 이상일 때 30%를 할인하고,
		 * 총 상품 구입금액이 100만원 이상일 때 40%를 할인한다.
		 * 지불 금액은 "할인된 상품 단가" * "수량"
		 * 출력 내용 : 상품 단가, 상품 수량, 지불 금액, 할인율
		 */
		int price = 0, amount = 0, res1 = 0, sale = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품의 단가는 얼마입니까? : ");
		price = sc.nextInt();
		System.out.print("몇 개를 구매하셨습니까? : ");
		amount = sc.nextInt();
		System.out.println("상품의 단가 : " + price + "원");
		System.out.println("상품의 수량 : " + amount + "개");
		
		//할인된 상품 단가 계산
		res1 = price * amount;
		if(res1 >= 1_000_000) {
			price *= 0.6;
			sale = 40;
		} else if(res1 >= 500_000) {
			price *= 0.7;
			sale = 30;
		} else {		//else부분을 빼고 싶으면 위에서 미리int sale = 0;으로 초기화시켜야 한다.
			sale = 0;
		}
		

		System.out.println("할인율 : " + sale + "% ");
		System.out.print("지불 금액 : " + amount + "개");
		
		sc.close();
	}
}
