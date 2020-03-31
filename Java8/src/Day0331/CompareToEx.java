package Day0331;

public class CompareToEx {
	public static void main(String[] args) {
		String a = "aaa";	//97 97 97
		String b = "aab";	//97 97 98
		int res = a.compareTo(b);
		System.out.println("비교 결과: " + res);	//-1
		
		String c = "aab";	//97 97 98
		String d = "abc";	//97 98 99
		int res2 = c.compareTo(d);
		System.out.println("비교 결과: " + res2);	//-1
		
		
		String e = "Java Programming Very Good";
		String f = "Java Programming";
		
		boolean compare1 = e.regionMatches(false, 5, f, 5, 11);
		boolean compare2 = e.regionMatches(true, 0, f, 0, 4);
		boolean compare3 = e.regionMatches(false, 0, f, 0, 4);
		
		System.out.println(compare1);
		System.out.println(compare2);
		System.out.println(compare3);
	}
}
