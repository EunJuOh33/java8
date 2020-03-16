
public class Day0206 {

	public static void main(String[] args) {
		char ch1 = "a";		//문자 1개를 입력하는 char형은 작은 따옴표로 감싸야 한다.
		char ch2 = 'ab';	//char형은 2개 이상의 문자를 입력할 수 없습니다.
		char ch3 = '\n';	//escape문자는 컴퓨터가 1개의 문자로 인식합니다.
		char ch4 = 'b';		//char형의 문자들은 고유의 넘버를 가진다.
		System.out.println(ch1);
		System.out.println(ch4);
		int result1 = ch1;	//chart형은 2바이트 int형은 4바이트이므로 ch1은 int형으로 자동형변환
		System.out.printl(result1);	//소문자 'a'는 97
		int result2 = ch4;
		System.out.println(result2);	//소문자 'b'는 98
		int result3 = 'z';
		System.out.println(result3);	//소문자 'z'는 122
		int result4 = '1';
		System.out.println(result4);	//문자 '1'은 49
		int result5 = '9';
		System.out.println(result5);	//문자 '9'는57
		int result6 = '0';
		System.out.println(result6);	//문자 '0'은 48
		int result7 = '가';
		System.out.println(result7);	//한글도 고유의 번호가 있다.
		char result8 = 97;	//char형은 숫자도 입력할 수 있다.
		System.out.println(result8);	//char 형에 숫자를 대입하면 그 숫자에 맞는 문자가 출력
		int result9 = 'A';
		System.out.println(result9);	//대문자 'a'는 65
		int result9 = 'A' + 32;
		System.out.println(result10);	//대문자에 32를 더하면 소문자가 된다.
	}
}
