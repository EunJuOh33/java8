package java8;

import java.util.Arrays;

public class Day032705 {
	public static void main(String[] args) {
		/*
		 * 1. 1~45를 입력한 배열을 작성합니다.
		 * 2. 작성한 배열을 무작위로 섞습니다.
		 * 3. 0 인덱스부터 6 인덱스까지 출력합니다.
		 */
		int[] arr = new int[45];
		
		for(int i=0; i<arr.length; i++) {	//1~45 대입
			arr[i] = i + 1;
			System.out.print(arr[i] + "\t");
			if((i+1) % 5 == 0) {		//5줄씩 출력하기 위한 코드
				System.out.println();
			}
		}
		System.out.println();
		
		for(int i=0; i<10_000; i++) {
			int r =(int)(Math.random() * 45);
			int temp = arr[0];
			arr[0] = arr[r];
			arr[r] = temp;
		}
		
		//무작위로 섞이 배열 출력하기
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + "\t");
			if((i+1) % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		
		
		//로또 추첨
		System.out.println("로또 추첨기");
		int[]ary = Arrays.copyOf(arr, 6);	//복사하기
		Arrays.sort(ary);	//정렬하기
		System.out.print("당첨 번호: ");
		
		for(int i=0; i<ary.length; i++) {
			System.out.print(ary[i] + " ");	//" "은 한 칸씩 띄우기
		}
		System.out.println(", 보너스 번호: " + arr[6]);
	}
}
