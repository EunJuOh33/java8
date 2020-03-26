package java8;

import java.util.Scanner;

public class Day032612 {
	public static void main(String[] args) {
		/* 키보드로부터 5개의 정수를 입력받아 최대값을 구하여 출력하는 프로그램을 작성하시오*/
		System.out.println("5개의 정수를 입력받아 최대값을 구하는 프로그램");
		Scanner sc = new Scanner(System.in);
		
		/* 정수 입력받기*/
		int[] arr = new int[5]; 
		for(int i=0; i<arr.length; i++) {
			System.out.print(i+1 + "번째 정수를 입력하세요.: ");
			arr[i] = sc.nextInt();
		}
		
		/* 최대값 구하기 */
		int max = Integer.MIN_VALUE;
		for(int num:arr) {
			if(max < num) {
				max = num;
			}
		}
		System.out.print("최대 값은 " + max + "입니다.");
		
		sc.close();
	}
}
