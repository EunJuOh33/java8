package Day0414;

import java.util.Date;

public class PrintfFormatEx {
	public static void main(String[] args) {
		int num = 10;
		double log = Math.log(num);
		System.out.format("log(%d) : %+10.6f %n", num, log);	// %+10.6f -> 소수점 6자리 합쳐서 10자리 출력
																// f는 더블 값
		
		Date today = new Date();
		System.out.printf("오늘 날짜 : %tY 년 %tm 월 %td 일 \n", today, today, today);	//
		System.out.printf("오늘 날짜 : %1$tY 년 %1$tm 월 %1$td 일 \n", today);
		System.out.printf("현재 시간 : %1$tH 시 %1$tM 분 %1$tS 초 \n", today);
		System.out.format("오늘 날짜 : %tY 년 %tm 월 %td 일 \n", today, today, today);
	}
}
