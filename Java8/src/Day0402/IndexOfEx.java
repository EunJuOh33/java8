package Day0402;

public class IndexOfEx {

	public static void main(String[] args) {
		String str = "자바 프로그래밍";
		int index = str.indexOf("프로");	
		System.out.println(index);	//3
		index = str.indexOf("C언어");
		System.out.println(index);	//-1
		
		str = "자바자바자바 프로프로 그래밍입니다.";
		index = str.indexOf("바");	//매개변수가 한 개일 경우에는 0번부터 검색
		System.out.println(index);	//1
		index = str.indexOf("바", index + 1);	//첫번째 매개변수: 검색어, 2번째 매개변수: 검색 시작 위치
		System.out.println(index);	//3
		index = str.indexOf("자");
		System.out.println(index);	//0
		
		//replace
		String str2 = str.replace("프로프로", "프로");
		System.out.println(str2);	//자바자바자바 프로 그래밍입니다.
	}
}
