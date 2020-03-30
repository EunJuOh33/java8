package Day0330;

public class StringbufferProg {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Java Programming");	//StringBuffer형 변수 생성
		StringBuffer str2;	//변수만 선언. null
		
		str2 = str.insert(5,  "JSP");	//str의 5번째에 "JSP"추가하여
										//str2에 str의 참조값을 가진다. (str의 내용과 str2의 내용이 같게 된다.)
		System.out.println(str);
		System.out.println(str2);
		
		
		str.append("Good");	//str의 끝에 문자열 "Good"추가
		str.append('A');
		System.out.println(str2);	//str의 값만 가져온 것이 아니라 주소를 가져왔기 때문에
									//str과 str2의 내용이 같다.
		
		str2.reverse();
		System.out.println(str2);
		
		str.setLength(10);
		System.out.println(str);
	}
}
