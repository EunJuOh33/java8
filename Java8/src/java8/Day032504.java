package java8;

public class Day032504 {
	public static void main(String[] args) {
		/*abcdefghijklmnopqrstuvwxyz
		* ABCDEFGHIJKLMNOPQRSTUVWXYZ
		*/
		for(int i=97; i<=122; i++) {	//a와 z 각각에 대응하는 숫자를 알고 있으면 숫자로 넣을 수 있다.
			System.out.print((char)i);
		}
		System.out.println();
		for(int i='A'; i<='Z'; i++) {
			System.out.print((char)i);
		}
	}
}
