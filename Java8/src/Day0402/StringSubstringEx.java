package Day0402;

public class StringSubstringEx {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);	//880815
		
		String secondNum = ssn.substring(7);	//7번째부터 끝까지 잘라낸다.
		System.out.println(secondNum);	//1234567
	}
}
