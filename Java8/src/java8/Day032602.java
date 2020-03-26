package java8;

public class Day032602 {
	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40, 50};	//선언시에는 마지막에 세미콜론을 사용합니다.
		int arr2[] = {60, 70, 80, 90, 100};	//2가지 생성방식을 혼용해도 문제되지 않는다.
		
		for(int i=0; i<5; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();
		
		for(int i=0; i<5; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println();
		
		arr1[2] = 300;	//배열의 인덱스는 일반 변수처럼 값을 변경할 수 있다.
		for(int i=0; i<5; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();
		
		int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8};
		for(int i=0; i<8; i++) {
			System.out.println(arr3[i]);
		}
		
//		arr3[6] = 7;	//배열을 정의한 범위를 넘어서는 사용이 불가능합니다.
//		System.out.println(arr3[6]);
	}
}
