package java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Day032613 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		/*키보드를 통하여 임의의 정수 10개를 입력하여 오름차순으로 정렬하고 데이터의 합과 평균을 구하여 출력한다.*/
		int r[] = new int[10];
		int number;
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("정수를 10개 입력하세요! : ");
		for(int x=0; x<r.length; x++) {
			r[x] = Integer.parseInt(inbr.readLine());
		}
		System.out.print("입력 데이터 값 : ");
		for(int x=0; x<r.length; x++) {
			System.out.print(r[x] + "..");
		}
		System.out.println();
		
		//오름차순 정렬 시작
//		for(int i=0; i<r.length; i++) {	//버블정렬
//			for(int j=0; j<r.length; j++) {
//				if(r[i] < r[j]) {	//r[i] > r[j] 이렇게 값을 반대로 하면 내림차순.
//					int temp = r[i];	//swap 코드
//					r[i] = r[j];
//					r[j] = temp;
//				}
//			}
//		}
		Arrays.sort(r);//Arrays 클래스에서 제공하는 정렬 메서드
		//오름차순 정렬 끝
		
		System.out.print("오름차순 데이터 값 : ");
		for(int x=0; x<r.length; x++) {
			System.out.print(r[x] + "..");
		}
		System.out.println();
		System.out.print("합계 : ");
		int sum = 0;
		for(int x=0; x<r.length; x++) {
			sum = sum + r[x];
		}
		System.out.println(sum);
		System.out.println("평균 : " + (sum / r.length));
	}
}
