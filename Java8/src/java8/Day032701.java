package java8;

public class Day032701 {
	public static void main(String[] args) {
		/*
		 * 1부터 100까지 저장하는 배열을 만들고
		 * 전체의 합을 출력하는 코드를 작성하세요.
		 */
		int arr [] = new int[100];
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + "\t");	//값에 모두 0이 들어간다
			if((i+1) % 5 == 0) {		//5줄씩 출력하기 위한 코드
				System.out.println();
			}
		}
		System.out.println();
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i + 1;
		}
		
		for (int i=0; i<arr.length; i++) {		//맨 위 코드와 같다. 값이 잘 들어갔는지 확인하기 위해 한번 더 출력
			System.out.print(arr[i] + "\t");	
			if((i+1) % 5 == 0) {		
				System.out.println();
			}
		}
		System.out.println();
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("1~100의 합: " + sum);
	}
}
