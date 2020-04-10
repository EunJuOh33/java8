package Baekjoon;

import java.util.Scanner;

public class No006 {
	public static void main(String[] args) {
		/* 정수 N개로 이루어진 수열 A와 정수 X가 주어진다.
		 * 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
		 */
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int A[] = new int[N];
		
		if(1 <= N && X <= 10000) {
	        for (int i=0; i < A.length; i++) {
	            A[i] = sc.nextInt();
	        }
	        
	        for (int i=0; i < A.length; i++) {
	            if (A[i] < X) {
	                System.out.print(A[i] + " ");
	            }
	        }
		}    
		sc.close();
	}
}
