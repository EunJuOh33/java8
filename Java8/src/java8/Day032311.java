package java8;

import java.util.Scanner;

public class Day032311 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 줄을 출력하시겠습니까?: ");
		int line = sc.nextInt();
		
		for(int i=0; i<line; i++) {
			for(int j=0; j<=i; j++) {
				if (j % 2 == 0) {
					System.out.print("$");
				} else {
					System.out.print("@");
				}
			}
		System.out.println();	
		}
		sc.close();
	}	
}
