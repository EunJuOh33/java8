package java8;

public class Day032603 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30};
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += arr[i];		
		}
		System.out.println(sum);
		
		int[] arr2 = {10, 20, 30, 40, 50};
		int sum2 =0;
		double avg2 = 0.0;
		for(int i=0; i<5; i++) {
			sum2 += arr2[i];
		}
		avg2 = sum2 / 5.0;
		System.out.println("배열의 합계: " + sum2);
		System.out.println("배열의 평균: " + avg2);
		System.out.println("배열의 개수: " + arr2.length);	//length는 배열의 크기(개수)를 출력
		
		int[] arr3 = {10, 20, 30, 40, 50, 60, 70, 80};
		System.out.println("arr3의 크기: " + arr3.length);
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}
	}
}
