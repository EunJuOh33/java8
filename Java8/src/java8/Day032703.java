package java8;

public class Day032703 {
	public static void main(String[] args) {
		/*
		 * 처음 두 개의 배열 요소만 초기화된 상태에서
		 * 나머지 배열 요소는 다음 계산 규칙에 따라 채우고
		 * 배열을 출력하세요.
		 * int arr[10] = {1, 0};
		 * 세 번째 요소 = 첫번째 요소 + 두번째 요소
		 * 열 번째 요소 = 여덟번째 요소 + 아홉번째 요소
		 */
		int[] arr = new int[10];
		arr[0] = 1;
		arr[1] = 2;
		
		for(int i=2; i<arr.length; i++) {
			arr[i] = arr[i-2] + arr[i-1];
		}

		for(int num : arr) {
			System.out.println(num);
		}
	}
}
