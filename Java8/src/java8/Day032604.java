package java8;

public class Day032604 {
	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = {0, 0, 0, 0, 0};	//0으로 채워진 크기가 5인 배열
		int[] arr3 = new int[5];	//배열의 크기가 5인 값이 없는 배열, 크기만 설정
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);	//모두 0이 들어감
		}
		
		boolean[] arr4 = new boolean[5];
		for(int i=0; i<arr4.length; i++) {
			System.out.println(arr4[i]);	//모두 false가 들어감
		}
		
		String[] arr5 = new String[5];
		for(int i=0; i<arr5.length; i++) {
			System.out.println(arr5[i]);	//모두 null이 들어
		}
		
//		arr3 = {10, 20, 30, 40, 50};	//중괄호 초기화는 최초의 한 번만 사용가능합니다.
		arr3[0] = 10;	//각각의 인덱스에 접근하는 것은 가능합니다.
		arr3[1] = 20;
		arr3[2] = 30;
		arr3[3] = 40;
		arr3[4] = 50;
	}
}
