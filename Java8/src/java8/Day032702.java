package java8;

public class Day032702 {
	public static void main(String[] args) {
		/*
		 * 0~9까지 저장된 배열을 출력 후 
		 * 0으로  초기화하여 출력하세요.
		 */
		int arr [] = new int[10];
		
		for(int i=0; i<arr.length; i++) {	//배열에 0~9까지 대입
			arr[i] = i;
		}
		
		for (int number: arr) {
			System.out.print(number);	//저장된 배열 출력
			
		}
		System.out.println();
		
//		for(int i=0; i<arr.length; i++) {	//각각의 요소를 0으로 대입하는 방식
//			arr[i] = 0;
//		}
		
		arr = new int[10];	//새로운 객체를 대입
							//새로운 객체를 대입하니 모두 0으로 바뀔 것.
		
		for (int number: arr) {
			System.out.print(number);	//초기화된 배열 출력
			
		}
		
		
	}
}
