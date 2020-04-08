package Baekjoon;

import java.util.Scanner;

public class No005 {
	public static void main(String[] args) {
		/* º° Ãâ·Â */
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if(N>=1 && N<=100) {	// N(1<=N>=100)
			for(int i=0; i<N; i++) {
				for(int j=1; j<N-i; j++) {
					System.out.print(" ");
				}
				for(int j=0; j<=i; j++) {
					System.out.print("*");
				} System.out.println();
			}
		}
		
		sc.close();
	}
}
