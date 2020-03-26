package java8;

import java.util.Arrays;

public class Day032610 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = num1;
		System.out.println(num2);
		
		String str1 = "Hello";
		String str2 = str1;
		System.out.println(str2);	//str2�� str1�� �ִ� Hello�� ���Եȴ�.
		System.out.println();
		
		int[] arr1 = {10, 20, 30};
		int[] arr2 = arr1;	//���� ���α׷��ֿ����� �Ұ����մϴ�. �ڹٿ����� ���ܷ� ��밡���մϴ�.
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println();
		
		int[] arr3 = new int[5];
		System.arraycopy(arr1,  1, arr3, 3, 2);	//arr1�� 1�� �ڸ����� �����մϴ�.
												//��ġ�� arr3 3�� �ڸ����� ���̴� 2��ŭ�� �����մϴ�.
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);	//0 0 0 20 30
		}
		System.out.println();
		
		int[] arr4 = Arrays.copyOf(arr1, 2);	//arr1�� 2���� �����϶�.
												//2�ڸ��� arr1.length�� �� �� �ִ�.
		for(int i=0; i<arr4.length; i++) {
			System.out.println(arr4[i]);	//10 20
		}
	}
}
