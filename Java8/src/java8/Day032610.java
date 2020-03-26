package java8;

import java.util.Arrays;

public class Day032610 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = num1;
		System.out.println(num2);
		
		String str1 = "Hello";
		String str2 = str1;
		System.out.println(str2);	//str2에 str1에 있던 Hello가 대입된다.
		System.out.println();
		
		int[] arr1 = {10, 20, 30};
		int[] arr2 = arr1;	//원래 프로그래밍에서는 불가능합니다. 자바에서는 예외로 사용가능합니다.
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println();
		
		int[] arr3 = new int[5];
		System.arraycopy(arr1,  1, arr3, 3, 2);	//arr1의 1번 자리부터 복사합니다.
												//위치는 arr3 3번 자리부터 길이는 2만큼만 복사합니다.
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);	//0 0 0 20 30
		}
		System.out.println();
		
		int[] arr4 = Arrays.copyOf(arr1, 2);	//arr1를 2개만 복사하라.
												//2자리에 arr1.length가 들어갈 수 있다.
		for(int i=0; i<arr4.length; i++) {
			System.out.println(arr4[i]);	//10 20
		}
	}
}
