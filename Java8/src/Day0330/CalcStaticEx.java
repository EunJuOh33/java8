package Day0330;

public class CalcStaticEx {
	public static void main(String[] args) {
		CalcStatic calcs = new CalcStatic();	//객체 생성
		double res1 = calcs.pi * 10;	//밑줄. 굳이 객체를 사용할 필요 없음
		System.out.println(res1);
		int res2 = calcs.plus(10, 3);
		System.out.println(res2);
		int res3 = calcs.minus(10, 3);
		System.out.println(res3);
		
		
		double result4 = CalcStatic.pi * 10;
		System.out.println(result4);
		int result5 = CalcStatic.plus(10, 3);
		System.out.println(result5);
		int result6 = CalcStatic.minus(10, 3);
		System.out.println(result6);
		
		
		System.out.println(CalcStatic.number);
		CalcStatic.number = 100;
		System.out.println(CalcStatic.number);
		
		System.out.println(calcs.number);	//number에 밑줄. 굳이 객체 사용할 필요 없음
	}
}
