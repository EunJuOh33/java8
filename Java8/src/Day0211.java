
public class Day0211 {
	public static void main(String[] args) {
		char ch;
		String str;
		ch = 'A' + '1';	//A는 65, 1는 48
		System.out.println(ch);
		int res = ch;
		System.out.println(res);
		str ="A" + "1";	//문자열은 아무것도 없거나 한 개의 문자만 있어도 쌍따옴표로 감싸면 문자열입니다.
		System.out.println(str);	//문자열의 덧셈은 하나의 문자열로 합치게 됩니다.
		String str2 = "10";
		int num2 = 10;
		String res2 = str2 + num2;	//문자열과 다른 자료형이 합치게 되면 하나의 문자열이 됩니다.
		System.out.println(res2);
		
		int num3 = 10;
		int num4 = 20;	//int는 integer의 약어.
		System.out.println(num3 + "" + num4);	//숫자를 문자로 변형하는 방법1
		String str3 = String.valueOf(num3);		//숫자를 문자로 변형하는 방법2
		
		String str4 = "100";
		System.out.println(str4 + 100);
		
		int num5 = Integer.valueOf(str4);
		double d1 = Double.valueOf(str4);
		
		int num6 = Integer.parseInt(str4);
		double d2 = Double.parseDouble(str4);
		
//		String str5 = "Hello";
//		int num7 = Integer.valueOf(str5);
//		int num7 = Integer.parseInt(str5);
//		System.out.println(num7);
	}
}


