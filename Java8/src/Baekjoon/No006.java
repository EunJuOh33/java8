package Baekjoon;

import java.util.Scanner;

public class No006 {
	public static void main(String[] args) {
		/* ���� N���� �̷���� ���� A�� ���� X�� �־�����.
		 * �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
