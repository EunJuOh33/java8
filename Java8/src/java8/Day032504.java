package java8;

public class Day032504 {
	public static void main(String[] args) {
		/*abcdefghijklmnopqrstuvwxyz
		* ABCDEFGHIJKLMNOPQRSTUVWXYZ
		*/
		for(int i=97; i<=122; i++) {	//a�� z ������ �����ϴ� ���ڸ� �˰� ������ ���ڷ� ���� �� �ִ�.
			System.out.print((char)i);
		}
		System.out.println();
		for(int i='A'; i<='Z'; i++) {
			System.out.print((char)i);
		}
	}
}
