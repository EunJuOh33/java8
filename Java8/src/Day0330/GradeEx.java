package Day0330;

import java.util.Scanner;

public class GradeEx {
	public static void main(String[] args) {
		/*
		* 국어, 영어, 수학 순으로 3개의 정수 입력 >> 90 88 96
		* 평균: 91
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어, 영어, 수학 순으로 3개의 정수 입력>> ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		Grade me = new Grade(kor, eng, mat);
		System.out.println("평균: " + me.avg());	//avg()는 평균을 계산하여 리턴
		
		sc.close();
	}
}
